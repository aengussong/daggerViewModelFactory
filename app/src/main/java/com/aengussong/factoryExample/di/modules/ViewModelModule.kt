package com.aengussong.factoryExample.di.modules

import androidx.lifecycle.ViewModel
import com.aengussong.factoryExample.di.ViewModelKey
import com.aengussong.factoryExample.viewmodel.*
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(ChangePasswordViewModel::class)
    abstract fun bindChangePassword(viewModel: ChangePasswordViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMain(viewModel: MainViewModel): ViewModel
}