package com.example.ejerciciosandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Ejercicio14 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio14)

        val nextButton = findViewById<Button>(R.id.nextButtont6)
            .setOnClickListener(){
                val intent = Intent(this, Ejercicio15 :: class.java)
                startActivity(intent)
            }
    }
}