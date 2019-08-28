package com.aengussong.factoryExample.domain.usecase

import javax.inject.Inject

class TestUseCase @Inject constructor(){

    fun getFormattedString(data:String) = "$data was retrieved"

}