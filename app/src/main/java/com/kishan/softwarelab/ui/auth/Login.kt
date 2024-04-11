package com.kishan.softwarelab.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textview.MaterialTextView
import com.kishan.softwarelab.MainActivity
import com.kishan.softwarelab.R

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_ui)

        val createaccount = findViewById<TextView>(R.id.createaccbtn)
        createaccount.setOnClickListener{
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }

        val forgot = findViewById<MaterialTextView>(R.id.forgot)
        forgot.setOnClickListener{
            val intent = Intent(this, ForgotPassword::class.java)
            startActivity(intent)
        }

        val login = findViewById<Button>(R.id.loginbtn)
        login.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}