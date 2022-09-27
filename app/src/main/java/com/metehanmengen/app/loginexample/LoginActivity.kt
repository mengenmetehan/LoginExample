package com.metehanmengen.app.loginexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.metehanmengen.app.loginexample.databinding.ActivityLoginBinding
import com.metehanmengen.app.loginexample.keys.PASSWORD
import com.metehanmengen.app.loginexample.keys.USERNAME

class LoginActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityLoginBinding

    private fun loginButtonClickCallback()
    {
        //Control username and password

        Intent(this, LoginAcceptedActivity::class.java).apply {
            putExtra(USERNAME, mBinding.loginActivityEditTextUsername.text.toString())
            putExtra(PASSWORD, mBinding.loginActivityEditTextUsername.text.toString())
            startActivity(this)
        }
    }
    private fun initAcceptSwitch()
    {
        mBinding.loginActivityLoginSwitchAccept.setOnCheckedChangeListener{
                _, checked -> mBinding.loginActivityButtonLogin.isEnabled = checked
        }
    }

    private fun initLoginButton()
    {
        mBinding.loginActivityButtonLogin.setOnClickListener{loginButtonClickCallback()}
    }

    private fun initViews()
    {
        initLoginButton()
        initAcceptSwitch()
    }

    private fun initBinding()
    {
        mBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    private fun initialize()
    {
        initBinding()
        initViews()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initialize()
    }
}