package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {


    //Object Declare

    private lateinit var txtEmailObj : TextInputEditText
    private lateinit var txtPwdObj : TextInputEditText
     private lateinit var btnLogIn : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.supportActionBar?.hide();
        setContentView(R.layout.activity_login)

    }
}