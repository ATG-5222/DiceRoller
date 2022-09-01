package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Busqueda del textView
        val rollButton: Button = findViewById(R.id.button2)
        //Listener, cuando se clickea el boton se ejecuta la función rollDice()
        rollButton.setOnClickListener { rollDice() }


    }////////////////////////////////////////////////////////////////////////////////////

    private fun rollDice() { // Función para obtener un número aleatorio del dado
        //Creación del objeto y llamada a función roll()
        val dice = Dice(6)
        val diceRoll = dice.roll()
        //Actualización del valor de textView
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }

}////////////////////////////////////////////////////////////////////////////////////////