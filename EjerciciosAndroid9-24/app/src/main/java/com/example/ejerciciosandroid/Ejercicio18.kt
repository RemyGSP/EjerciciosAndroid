package com.example.ejerciciosandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Ejercicio18 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio18)

        val nextButton = findViewById<Button>(R.id.nextButton10)
            .setOnClickListener(){
                val intent = Intent(this, Ejercicio19 :: class.java)
                startActivity(intent)
            }
    }
}