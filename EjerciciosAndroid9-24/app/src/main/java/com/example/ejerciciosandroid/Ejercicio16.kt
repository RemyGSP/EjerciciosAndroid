package com.example.ejerciciosandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Ejercicio16 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio16)

        val nextButton = findViewById<Button>(R.id.nextButton8)
            .setOnClickListener(){
                val intent = Intent(this, Ejercicio17 :: class.java)
                startActivity(intent)
            }
    }
}