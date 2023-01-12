package com.hiltdemo.di

import android.content.Context
import android.widget.Toast
import com.hiltDemo.base_interface.BaseInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject

@Module
@InstallIn(SingletonComponent::class)
class MainModule {
  @Provides
  fun provideAppModuleImpl(@ApplicationContext context: Context): BaseInterface {
    return ShowToastOnclick(context)
  }
}

class ShowToastOnclick @Inject constructor(private val context: Context) :
  BaseInterface {
  override fun showPopup() {
    Toast.makeText(context, "APP MODULE IMPL POPUP", Toast.LENGTH_LONG).show()
  }
}