package com.example.myapplication

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.telephony.TelephonyManager

class PCReciever: BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val stateStr = intent!!.extras!!.getString(TelephonyManager.EXTRA_STATE)
        val number = intent!!.extras!!.getString(TelephonyManager.EXTRA_INCOMING_NUMBER)
        if (stateStr == TelephonyManager.EXTRA_STATE_IDLE) {
            println("state: ended ---- number: $number")
        } else if (stateStr == TelephonyManager.EXTRA_STATE_OFFHOOK) {
            println("state: started --- number: $number")
        } else if (stateStr == TelephonyManager.EXTRA_STATE_RINGING) {
            println("state: incoming --- number: $number")
        }
    }
}