package com.aengussong.factoryExample.viewmodel

import androidx.lifecycle.ViewModel
import com.aengussong.factoryExample.domain.usecase.TestUseCase
import javax.inject.Inject


class MainViewModel @Inject constructor(private val testUseCase: TestUseCase)
    : ViewModel() {

    fun getData() = testUseCase.getFormattedString("MainViewModel")
}