package com.hiltdemo.di

import android.content.Context
import com.example.api.AuthService
import com.google.firebase.auth.FirebaseAuth
import com.hiltDemo.firebase_module.FirebaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class AuthServiceModule {

    @Provides
    fun provideAuthService(@ApplicationContext context: Context): AuthService {
      return  FirebaseImpl(FirebaseAuth.getInstance(), context)
    }
}
