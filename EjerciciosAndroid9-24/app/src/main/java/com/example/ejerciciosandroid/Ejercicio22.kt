package com.example.ejerciciosandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class Ejercicio22 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio22)

        var newScreen = Intent(this, Ejercicio22SegundaParte :: class.java)
        val redButton = findViewById<Button>(R.id.button)
            .setOnClickListener {
                newScreen.putExtra("color", "Rojo");
                startActivity(newScreen);
            }
        val blueButton = findViewById<Button>(R.id.button2)
            .setOnClickListener {
                newScreen.putExtra("color", "Azul");
                startActivity(newScreen);
            }
        val greenButton = findViewById<Button>(R.id.button3)
            .setOnClickListener {
                newScreen.putExtra("color", "Verde");
                startActivity(newScreen);
            }

    }
}