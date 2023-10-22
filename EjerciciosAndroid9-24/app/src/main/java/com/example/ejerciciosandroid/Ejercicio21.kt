package com.example.ejerciciosandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class Ejercicio21 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio21)

        val nextButton = findViewById<Button>(R.id.nextButton14)
            .setOnClickListener(){
                val intent = Intent(this, Ejercicio22 :: class.java)
                startActivity(intent)
            }

    }
}