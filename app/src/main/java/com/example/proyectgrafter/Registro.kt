package com.example.proyectgrafter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        var button : Button = findViewById (R.id.Registrar);

        button.setOnClickListener()
        {
            val intento1 = Intent (this, Logueado::class.java)
            startActivity(intento1)
        }



    }
}