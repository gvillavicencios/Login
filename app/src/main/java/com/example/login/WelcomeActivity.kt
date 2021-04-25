package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import com.google.android.material.textview.MaterialTextView

class WelcomeActivity : AppCompatActivity() {

    private lateinit var editTextTextEmailAddress : TextView
    private lateinit var editTextTextPasswordAddress : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        editTextTextEmailAddress = findViewById(R.id.editTextEmailAddress)
        editTextTextPasswordAddress = findViewById(R.id.editTextPassword)

        intent.extras?.let {
            (it.getParcelable("usrInformation") as? UserLoginData)?.let { user ->
                editTextTextEmailAddress.text= user.emailKey
                editTextTextPasswordAddress.text= user.passwordKey
            }
        }
    }
}