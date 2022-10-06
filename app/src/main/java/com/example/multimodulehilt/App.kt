package com.example.multimodulehilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {

    //var appComponent : ApplicationComponent? = null

    override fun onCreate() {
        super.onCreate()

        //appComponent = DaggerApplicationComponent.create()

    }
}