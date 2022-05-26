package com.example.proyectgrafter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var button : Button = findViewById (R.id.loguear)

        button.setOnClickListener()
        {
            val intent = Intent (this, Logueado::class.java)
            startActivity(intent)
        }

        var button1 : Button = findViewById (R.id.registrarse)

        button1.setOnClickListener()
        {
            val intent = Intent (this, Registro::class.java)
            startActivity(intent)
        }

    }
}
