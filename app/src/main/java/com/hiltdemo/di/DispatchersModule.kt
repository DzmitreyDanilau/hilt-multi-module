package com.hiltdemo.di

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
  fun provideIODispatcher() = Dispatchers.IO
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class IO