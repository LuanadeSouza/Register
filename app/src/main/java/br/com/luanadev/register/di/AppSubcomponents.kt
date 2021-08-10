package br.com.luanadev.register.di

import br.com.luanadev.register.login.LoginComponent
import br.com.luanadev.register.registration.RegistrationComponent
import br.com.luanadev.register.user.UserComponent
import dagger.Module

@Module(
    subcomponents = [
        RegistrationComponent::class,
        LoginComponent::class,
        UserComponent::class
    ]
)
class AppSubcomponents
