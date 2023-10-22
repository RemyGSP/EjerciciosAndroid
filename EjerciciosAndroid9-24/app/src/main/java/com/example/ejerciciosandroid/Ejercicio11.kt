package com.example.ejerciciosandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Ejercicio11  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio11)

        val nextButton = findViewById<Button>(R.id.nextButton3)
            .setOnClickListener(){
                val intent = Intent(this, Ejercicio12 :: class.java)
                startActivity(intent)
            }

    }

}