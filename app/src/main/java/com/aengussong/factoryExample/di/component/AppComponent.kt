package com.aengussong.factoryExample.di.component

import android.app.Application
import com.aengussong.factoryExample.app.App
import com.aengussong.factoryExample.di.modules.AppModule
import com.aengussong.factoryExample.di.modules.BuilderModule
import com.aengussong.factoryExample.di.modules.ViewModelFactoryModule
import com.aengussong.factoryExample.di.modules.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton


@Singleton
@Component(modules = [
    AppModule::class,
    AndroidInjectionModule::class,
    ViewModelFactoryModule::class,
    ViewModelModule::class,
    BuilderModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(app: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)
}