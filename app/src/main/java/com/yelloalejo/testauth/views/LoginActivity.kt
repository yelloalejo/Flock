package com.yelloalejo.testauth.views

import com.facebook.FacebookSdk
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.facebook.CallbackManager
import com.facebook.login.LoginManager
import com.facebook.login.widget.LoginButton
import com.google.firebase.auth.FirebaseAuth
import com.yelloalejo.testauth.R


class LoginActivity : AppCompatActivity() {
    private var loginFacebook:LoginManager? = null
    private var mAuth: FirebaseAuth? = null
    private var callbackManager = CallbackManager.Factory.create()

    override fun onCreate(savedInstanceState: Bundle?) {
        FacebookSdk.sdkInitialize(applicationContext)


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance()

    }
    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = mAuth?.currentUser
    }


}
