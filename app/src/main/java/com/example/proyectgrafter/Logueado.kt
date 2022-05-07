package com.example.proyectgrafter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Logueado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logueado)

        var button : Button = findViewById (R.id.Continuar);

        button.setOnClickListener()
        {
            val intento1 = Intent (this, Perfilusuario::class.java)
            startActivity(intento1)
        }

    }
}