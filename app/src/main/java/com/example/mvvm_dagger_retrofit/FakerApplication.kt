package com.example.mvvm_dagger_retrofit

import android.app.Application
import com.example.mvvm_dagger_retrofit.di.ApplicationComponent
import com.example.mvvm_dagger_retrofit.di.DaggerApplicationComponent

class FakerApplication:Application() {

    lateinit var applicationComponent: ApplicationComponent
    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent.factory().create(this)
    }
}
