package com.hiltdemo.di

import com.hiltDemo.common.IO
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.Dispatchers
import javax.inject.Qualifier
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DispatchersModule {

  @Provides
  @Singleton
  @IO
  fun provideIODispatcher() = Dispatchers.IO
}

