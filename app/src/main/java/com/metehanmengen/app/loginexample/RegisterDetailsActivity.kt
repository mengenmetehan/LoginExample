package com.metehanmengen.app.loginexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Toast
import com.metehanmengen.app.loginexample.data.RegisterInfo
import com.metehanmengen.app.loginexample.databinding.ActivityRegisterBinding
import com.metehanmengen.app.loginexample.databinding.ActivityRegisterDetailsBinding
import com.metehanmengen.app.loginexample.keys.REGISTER_INFO

class RegisterDetailsActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityRegisterDetailsBinding

    private fun registerInfoMessage()
    {
        mBinding.registerDetailsActivityButtonRegister.setOnClickListener {
            Toast.makeText(this, "Congratulations ! Your register is succesfull", Toast.LENGTH_LONG)
                .show()
        }
    }

    private fun switchAcceptCallback(checked: Boolean)
    {
        if (checked)
            Toast.makeText(this, "Accepted", Toast.LENGTH_LONG).show()

        mBinding.registerDetailsActivityButtonRegister.isEnabled = checked
    }

    private fun initSwitchAccept()
    {
        mBinding.registerDetailsActivitySwitchAccept.setOnCheckedChangeListener{
            _, checked -> switchAcceptCallback(checked)
        }
    }

    private fun infoInputMessages(message: String)
    {
        var result = message.split(" ")
        mBinding.registerDetailsActivityEditTextName.setText(result[0])
        mBinding.registerDetailsActivityEditTextEmail.setText(result[1])
        mBinding.registerDetailsActivityEditTextUsername.setText(result[2])
        mBinding.registerDetailsActivityEditTextPassword.setText(result[3])

    }

    private fun initBinding()
    {
        mBinding = ActivityRegisterDetailsBinding.inflate(layoutInflater)

        setContentView(mBinding.root)
    }

    private fun initViews()
    {
        var ri = intent.getSerializableExtra(REGISTER_INFO)
        var message = ri.toString()
        Toast.makeText(this, message, Toast.LENGTH_SHORT ).show()

        infoInputMessages(message)
        initSwitchAccept()
        registerInfoMessage()
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