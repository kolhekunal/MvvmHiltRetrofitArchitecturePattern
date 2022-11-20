package com.mvvm_hilt_architecture_pattern.application

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MvvmHiltApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}