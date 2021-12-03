package com.dl.kotlin

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder

class KotlinService : Service() {

    override fun onBind(intent: Intent): IBinder {
        return Binder()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
    }
}