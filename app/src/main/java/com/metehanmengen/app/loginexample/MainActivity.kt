package com.metehanmengen.app.loginexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    fun loginButtonClick()
    {
        Intent(this, LoginActivity::class.java).apply {
            startActivity(this)
        }
    }

    fun registerButtonClick()
    {
        Intent(this, RegisterActivity::class.java).apply {
            startActivity(this)
        }
    }

    fun exitButtonClick() {
        Toast.makeText(this, R.string.exit_message_text, Toast.LENGTH_SHORT).show()
        finish()
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onButtonClicked(view: View) = when (view.id)
    {
        R.id.mainActivityRegisterButton -> registerButtonClick()
        R.id.mainActivityLoginButton -> loginButtonClick()
        else -> exitButtonClick()
    }
}