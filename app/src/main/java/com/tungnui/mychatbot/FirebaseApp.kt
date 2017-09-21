package com.tungnui.mychatbot

import com.google.firebase.database.FirebaseDatabase



/**
 * Created by thanh on 21/09/2017.
 */
class FirebaseApp : android.app.Application() {

    override fun onCreate() {
        super.onCreate()
        FirebaseDatabase.getInstance().setPersistenceEnabled(true)
    }
}