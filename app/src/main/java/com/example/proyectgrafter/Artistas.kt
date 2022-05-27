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

        var button1 : Button = findViewById (R.id.obrastres);

        button1.setOnClickListener()
        {
            val intento1 = Intent (this, Galeria2::class.java)
            startActivity(intento1)
        }


    }
}