package com.aengussong.factoryExample.di.modules

import com.aengussong.factoryExample.ui.activities.MainActivity
import com.aengussong.factoryExample.ui.fragments.ContentFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class BuilderModule {

    @ContributesAndroidInjector
    internal abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector
    internal abstract fun bindChangePassFragment(): ContentFragment

}