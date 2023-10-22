package com.example.ejerciciosandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Ejercicio10  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio10)

        val nextButton = findViewById<Button>(R.id.nextButton2)
            .setOnClickListener(){
                val intent = Intent(this, Ejercicio11 :: class.java)
                startActivity(intent)
            }
    }

}