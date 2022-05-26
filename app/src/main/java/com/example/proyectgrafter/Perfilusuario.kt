package com.example.proyectgrafter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity.CENTER
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RatingBar
import kotlin.random.Random

class Perfilusuario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfilusuario)






        var button : Button = findViewById (R.id.obras);

        button.setOnClickListener()
        {
            val intento1 = Intent (this, Artistas::class.java)
            startActivity(intento1)
        }





    }
}