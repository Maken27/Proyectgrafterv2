package com.example.proyectgrafter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Artistas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artistas)

        var button : Button = findViewById (R.id.obrasdos);

        button.setOnClickListener()
        {
            val intento1 = Intent (this, Galeria::class.java)
            startActivity(intento1)
        }


    }
}