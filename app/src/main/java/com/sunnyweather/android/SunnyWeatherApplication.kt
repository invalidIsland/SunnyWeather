package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context

        const val TOKEN = "i8qK09HgqUtHo4oA"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}