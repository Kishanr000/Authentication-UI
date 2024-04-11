package com.kishan.softwarelab.ui.Onboarding_Screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.kishan.softwarelab.MainActivity
import com.kishan.softwarelab.R
import com.kishan.softwarelab.ui.auth.Login

class Onbording_third : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onbording_third)

        val joinbtn = findViewById<Button>(R.id.joinbtn)
        joinbtn.setOnClickListener{
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        val login = findViewById<TextView>(R.id.loginbtn)
        login.setOnClickListener{
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
//        finish()
    }
}