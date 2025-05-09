package com.example.sentinelai

import android.app.Application
import com.google.firebase.FirebaseApp

/**
 * Custom Application class for initializing Firebase and other application-level configurations.
 */
class MyApplication : Application() {
     override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)
        // Aquí puedes agregar otra lógica de inicialización de la aplicación
     }
}