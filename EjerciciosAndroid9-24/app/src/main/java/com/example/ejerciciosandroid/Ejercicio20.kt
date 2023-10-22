package com.example.ejerciciosandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Ejercicio20 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio20)

        val nextButton = findViewById<Button>(R.id.nextButton12)
            .setOnClickListener(){
                val intent = Intent(this, Ejercicio21 :: class.java)
                startActivity(intent)
            }
    }
}