package com.example.ejerciciosandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Ejercicio19 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio19)

        val nextButton = findViewById<Button>(R.id.nextButton11)
            .setOnClickListener(){
                val intent = Intent(this, Ejercicio20 :: class.java)
                startActivity(intent)
            }
    }
}