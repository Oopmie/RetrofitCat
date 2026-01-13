package com.example.retrofitcat

import android.app.Application
import com.example.retrofitcat.di.appModules
import org.koin.core.context.startKoin

class RetrofitCatApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModules)
        }
    }
}