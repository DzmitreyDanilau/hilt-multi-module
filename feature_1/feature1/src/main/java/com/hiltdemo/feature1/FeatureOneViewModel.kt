package com.hiltdemo.feature1

import androidx.lifecycle.ViewModel
import com.hiltDemo.feature1lib.FeatureLibImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FeatureOneViewModel @Inject constructor(
  private val dependency: FeatureLibImpl
) : ViewModel() {

  fun print() = dependency.getValue()

  fun printValueFromBaseInterface() {
    dependency.getBaseInterfaceValue()
  }

  fun printValueAuthService() {
    dependency.getBaseInterfaceValue()
  }
}
