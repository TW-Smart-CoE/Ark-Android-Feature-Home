package com.thoughtworks.ark.feature.home.app

import android.app.Application
import com.thoughtworks.ark.router.Router
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Router.enableLog(BuildConfig.DEBUG)
    }
}