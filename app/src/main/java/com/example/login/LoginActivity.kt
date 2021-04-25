package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.login.R.id.*
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {


    //Object Declare
    private lateinit var txtEmailObj : TextInputLayout
    private lateinit var txtPwdObj : TextInputLayout
    private lateinit var btnLogIn : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.supportActionBar?.hide();
        setContentView(R.layout.activity_login)

        // Get Values
        txtEmailObj= findViewById(R.id.emailInput)
        txtPwdObj= findViewById(R.id.passwordInput)

        //Get Object and try the intent
        btnLogIn= findViewById(R.id.btnLogin)

        btnLogIn.setOnClickListener(){

            //Get Data and prepare variable
            val myUserData = UserLoginData(txtEmailObj.editText!!.text.toString(), txtPwdObj.editText!!.text.toString())
            val myIntent = Intent(this,WelcomeActivity::class.java)
            myIntent.putExtra("usrInformation", myUserData)
            startActivity(myIntent)
        }

    }
}