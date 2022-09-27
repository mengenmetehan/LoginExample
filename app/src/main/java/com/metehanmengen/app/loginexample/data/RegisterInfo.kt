package com.metehanmengen.app.loginexample.data

data class RegisterInfo(var name: String, var email: String, var username: String, var password :String) : java.io.Serializable
{
    override fun toString() = "$name $email $username $password"

}