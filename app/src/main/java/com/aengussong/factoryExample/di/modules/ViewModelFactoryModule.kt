package com.aengussong.factoryExample.di.modules

import androidx.lifecycle.ViewModelProvider
import com.aengussong.factoryExample.factory.DaggerViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {
    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: DaggerViewModelFactory): ViewModelProvider.Factory
}