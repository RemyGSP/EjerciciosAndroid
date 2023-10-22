package com.example.ejerciciosandroid


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Ejercicio15 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio15)

        val nextButton = findViewById<Button>(R.id.nextButton7)
            .setOnClickListener(){
                val intent = Intent(this, Ejercicio16 :: class.java)
                startActivity(intent)
            }
    }
}