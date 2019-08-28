package com.aengussong.factoryExample.ui.activities

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import com.aengussong.factoryExample.factory.DaggerViewModelFactory
import javax.inject.Inject


abstract class BaseActivity : AppCompatActivity() {

    @Inject
    lateinit var factory: DaggerViewModelFactory

    fun getViewModel(viewModel: Class<out ViewModel>): ViewModel = ViewModelProviders.of(this, factory).get(viewModel)
}