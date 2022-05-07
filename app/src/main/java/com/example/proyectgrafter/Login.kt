package com.example.proyectgrafter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var button : Button = findViewById (R.id.loguear);

        button.setOnClickListener()
        {
            val intento2 = Intent (this, Logueado::class.java)
            startActivity(intento2)
        }


        var buttonRegistro: Button = findViewById (R.id.loguear2);

        button.setOnClickListener()
        {
            val intento3 = Intent (this, Logueado::class.java)
            startActivity(intento3)
        }


    }
}