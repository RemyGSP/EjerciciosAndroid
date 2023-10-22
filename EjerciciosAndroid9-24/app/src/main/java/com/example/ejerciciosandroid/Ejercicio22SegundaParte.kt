package com.example.ejerciciosandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Ejercicio22SegundaParte : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio22segundaparte)
        val nextButton = findViewById<Button>(R.id.nextButton14)
            .setOnClickListener(){
                val intent = Intent(this, Ejercicio24 :: class.java)
                startActivity(intent)
            }

    }

    override fun onStart() {
        super.onStart()
        val intent = intent
        val textToPut = intent?.extras?.getString("color").toString();
        val textDisplay = findViewById<TextView>(R.id.textView);
        textDisplay.text = textToPut
    }
}