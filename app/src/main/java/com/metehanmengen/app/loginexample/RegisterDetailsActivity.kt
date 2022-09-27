package com.metehanmengen.app.loginexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RegisterDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_details)
        title = "Register Details"
    }
}