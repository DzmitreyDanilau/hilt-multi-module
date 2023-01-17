package com.hiltDemo.firebase_module

import android.content.Context
import android.widget.Toast
import com.example.api.AuthService
import com.google.firebase.auth.FirebaseAuth

class FirebaseImpl(
    private val firebaseAuth: FirebaseAuth,
    private val context: Context
) : AuthService {
    override fun auth() {
        Toast.makeText(context, "FirebaseImpl", Toast.LENGTH_LONG).show()
    }
}
