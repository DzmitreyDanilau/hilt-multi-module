package com.hiltDemo.feature1lib

import com.example.api.AuthService
import com.hiltDemo.base_interface.BaseInterface
import com.hiltDemo.library1.CommonLibraryImpl
import javax.inject.Inject

class FeatureLibImpl @Inject constructor(
    private val dependency1: CommonLibraryImpl,
    private val baseInterface: BaseInterface,
    private val authService: AuthService
) {

    fun getValue() = dependency1.getCommonLibraryImplValue()

    fun getBaseInterfaceValue() {
        baseInterface.showPopup()
    }

    fun getAuthServiceValue() {
        authService.auth()
    }
}
