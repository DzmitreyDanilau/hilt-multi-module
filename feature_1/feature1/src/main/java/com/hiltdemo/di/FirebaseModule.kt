package com.hiltdemo.di

import com.google.firebase.auth.FirebaseAuth
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@Module
@InstallIn(ActivityRetainedComponent::class)
class FirebaseModule {
  @Provides
  fun provideFirebase(): FirebaseAuth = FirebaseAuth.getInstance()
}