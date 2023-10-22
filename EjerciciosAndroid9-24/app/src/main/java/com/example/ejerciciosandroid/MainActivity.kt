package com.example.ejerciciosandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextButton = findViewById<Button>(R.id.nextButton1)
            .setOnClickListener {
                val intent = Intent(this, Ejercicio10::class.java)
                startActivity(intent)
            }
    }

}