package com.metehanmengen.app.loginexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.metehanmengen.app.loginexample.keys.PASSWORD
import com.metehanmengen.app.loginexample.keys.USERNAME

class LoginAcceptedActivity : AppCompatActivity() {
    private var mUsername: String? = ""
    private var mPassword: String? = ""

    private fun initViews()
    {
        intent.also {
            mUsername = it.getStringExtra(USERNAME)

            if (mUsername == null) {
                Toast.makeText(this, "Invalid Value", Toast.LENGTH_SHORT).show()
                finish()
            }

            mUsername.also{
                title = it
            }
            mPassword = it.getStringExtra(PASSWORD)

        }
    }

    private fun initialize()
    {
        initViews()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_accepted)
        initialize()
    }
}