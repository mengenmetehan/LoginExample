package com.metehanmengen.app.loginexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.metehanmengen.app.loginexample.databinding.ActivityMainBinding
import com.metehanmengen.app.loginexample.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityRegisterBinding

    private fun initAcceptSwitch()
    {
        mBinding.registerActivitySwitchAccept.setOnCheckedChangeListener { _, checked ->
            mBinding.registerActivityButtonRegister.isEnabled = checked
        }
    }

    private fun loginButtonClickedCallback()
    {
       Intent(this, RegisterDetailsActivity::class.java).apply {
           startActivity(this)
       }
    }


    private fun initRegisterButton()
    {
        mBinding.registerActivityButtonRegister.setOnClickListener{loginButtonClickedCallback()}
    }


    private fun initView()
    {
        initRegisterButton()
        initAcceptSwitch()
    }

    private fun initBinding()
    {
        mBinding = ActivityRegisterBinding.inflate(layoutInflater)

        setContentView(mBinding.root)
    }

    private fun initialize()
    {
        initBinding()
        initView()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initialize()
    }
}