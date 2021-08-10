package br.com.luanadev.register.di

import android.content.Context
import android.os.UserManager
import br.com.luanadev.register.login.LoginComponent
import br.com.luanadev.register.registration.RegistrationActivity
import br.com.luanadev.register.registration.RegistrationComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class, AppSubcomponents::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun registrationComponent(): RegistrationComponent.Factory
    fun loginComponent(): LoginComponent.Factory
    fun userManager(): UserManager
}