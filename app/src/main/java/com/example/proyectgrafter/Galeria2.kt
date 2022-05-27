package com.example.proyectgrafter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Galeria2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeria2)

        var button : Button = findViewById (R.id.cont2)

        button.setOnClickListener()
        {
            val intent = Intent (this, Contenidoexclusivo2::class.java)
            startActivity(intent)
        }

        var button1 : Button = findViewById (R.id.contacto2)

        button1.setOnClickListener()
        {
            val intent = Intent (this, Contacto2::class.java)
            startActivity(intent)
        }


    }





}