package com.metehanmengen.app.loginexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.metehanmengen.app.loginexample.data.RegisterInfo
import com.metehanmengen.app.loginexample.databinding.ActivityRegisterBinding
import com.metehanmengen.app.loginexample.keys.REGISTER_INFO

class RegisterActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityRegisterBinding

    private fun initAcceptSwitch()
    {
        mBinding.registerActivitySwitchAccept.setOnCheckedChangeListener { _, checked ->
            mBinding.registerActivityButtonRegister.isEnabled = checked
        }
    }

    private fun createRegisterInfo() : RegisterInfo
    {
        val name = mBinding.registerActivityEditTextName.text.toString()
        val email = mBinding.registerActivityEditTextEmail.text.toString()
        val username = mBinding.registerActivityEditTextUsername.text.toString()
        val password = mBinding.registerActivityEditTextPassword.text.toString()

        return RegisterInfo(name, email, username, password)

    }

    private fun confirmPassword() =
        mBinding.registerActivityEditTextPassword.text.toString() == mBinding.registerActivityEditTextConfirmPassword.text.toString()


    private fun registerButtonClickedCallback()
    {
        if(confirmPassword()) {
            val registerInfo = createRegisterInfo()

            Intent(this, RegisterDetailsActivity::class.java).apply {
                putExtra(REGISTER_INFO, registerInfo)
                startActivity(this)
            }
        }
        else
            Toast.makeText(this, "Confirm your password", Toast.LENGTH_SHORT).show()
    }


    private fun initRegisterButton()
    {
        mBinding.registerActivityButtonRegister.setOnClickListener{registerButtonClickedCallback()}
    }


    private fun initViews()
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
        initViews()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initialize()
    }
}