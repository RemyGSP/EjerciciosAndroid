package com.example.ejerciciosandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Ejercicio17 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio17)

        val nextButton = findViewById<Button>(R.id.nextButton9)
            .setOnClickListener(){
                val intent = Intent(this, Ejercicio18 :: class.java)
                startActivity(intent)
            }
    }
}