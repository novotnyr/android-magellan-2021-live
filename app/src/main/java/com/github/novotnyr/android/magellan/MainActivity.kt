package com.github.novotnyr.android.magellan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.messaging.FirebaseMessaging

// Google Cloud Messaging / Firebase Cloud Messaging
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1. Potrebujeme ziskat token reprezentujuci konkretne zariadenie
        //2. Pomocou tokenu vieme z Firebase console posielat notifikacie do konkretneho zariadenia

        FirebaseMessaging.getInstance().token.addOnSuccessListener { token ->
            //TODO: treba osetrit, ze token je null

            //a. token zalogujeme - NEPOUZIVAME V PRODUKCII!
            Log.e("TOKEN", token)
            //b. token zoberieme a pouzijeme vo webovej Firebase console
        }
    }
}