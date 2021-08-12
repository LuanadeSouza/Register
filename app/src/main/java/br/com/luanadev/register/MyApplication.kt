package br.com.luanadev.register

import android.app.Application
import br.com.luanadev.register.di.AppComponent
import br.com.luanadev.register.di.DaggerAppComponent

open class MyApplication : Application() {

    val appComponent: AppComponent by lazy {
        initializeComponent()
    }

    open fun initializeComponent(): AppComponent {
        return DaggerAppComponent.factory().create(applicationContext)
    }
}