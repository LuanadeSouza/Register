package br.com.luanadev.register.di

import br.com.luanadev.register.storage.SharedPreferencesStorage
import br.com.luanadev.register.storage.Storage
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class StorageModule {

    @Binds
    abstract fun provideStorage(storage: SharedPreferencesStorage): Storage
}
