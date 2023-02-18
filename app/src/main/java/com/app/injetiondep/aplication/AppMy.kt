package com.app.injetiondep.aplication

import android.app.Application
import com.app.injetiondep.di.mainModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.loadKoinModules
import org.koin.core.context.startKoin

class AppMy : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@AppMy)
            loadKoinModules(mainModule)
        }
    }
}