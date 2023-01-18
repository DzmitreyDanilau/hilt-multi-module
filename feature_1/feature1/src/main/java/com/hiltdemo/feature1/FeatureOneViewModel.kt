package com.hiltdemo.feature1

import androidx.lifecycle.ViewModel
import com.example.api.ApiService
import com.hiltDemo.feature1lib.FeatureLibImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FeatureOneViewModel @Inject constructor(
    private val dependency: FeatureLibImpl, private val api: ApiService
) : ViewModel() {

    fun print() = dependency.getValue()

    fun printValueFromBaseInterface() {
        dependency.getBaseInterfaceValue()
    }

    fun printValueAuthService() {
        dependency.getBaseInterfaceValue()
    }
}
