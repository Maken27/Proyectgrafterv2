package com.example.proyectgrafter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button : Button = findViewById (R.id.Iniciar);

        button.setOnClickListener()
        {
            val intento1 = Intent (this, Login::class.java)
            startActivity(intento1)
        }

    }
}