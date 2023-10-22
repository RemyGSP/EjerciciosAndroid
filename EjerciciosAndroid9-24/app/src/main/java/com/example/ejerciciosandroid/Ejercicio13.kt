package com.example.ejerciciosandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Ejercicio13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio13)

        val nextButton = findViewById<Button>(R.id.nextButton5)
            .setOnClickListener(){
                val intent = Intent(this, Ejercicio14 :: class.java)
                startActivity(intent)
            }
    }
}