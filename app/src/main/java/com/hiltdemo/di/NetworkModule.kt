package com.hiltdemo.di

import android.content.Context
import com.example.api.ApiService
import com.example.network.RestApiServiceFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Provides
    fun provideAuthService(@ApplicationContext context: Context): ApiService? {
        return RestApiServiceFactory().create()
    }
}
