package cn.zhaojunchen.weather

import android.app.Application
import android.content.Context

class App : Application() {
    companion object {
        lateinit var context: Context
        const val TOKEN = "xxx"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}