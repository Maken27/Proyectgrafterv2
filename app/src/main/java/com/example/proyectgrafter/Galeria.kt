package com.example.proyectgrafter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Galeria : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeria)


        var button : Button = findViewById (R.id.button4)

        button.setOnClickListener()
        {
            val intent = Intent (this, Contenidoexclusivo::class.java)
            startActivity(intent)
        }


        var button1 : Button = findViewById (R.id.contacto)

        button1.setOnClickListener()
        {
            val intent = Intent (this, Contacto::class.java)
            startActivity(intent)
        }


    }
}