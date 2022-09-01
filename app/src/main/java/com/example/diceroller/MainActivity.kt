package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Busqueda del boton
        val rollButton: Button = findViewById(R.id.button3)
        //Listener, cuando se clickea el boton se ejecuta la función rollDice()
        rollButton.setOnClickListener { rollDice() }
        //Lanzamiento del dado cuando se abre la aplicación
        rollDice()
    }////////////////////////////////////////////////////////////////////////////////////

    private fun rollDice() { // Función para obtener un número aleatorio del dado
        //Creación del objeto y llamada a función roll()
        val dice = Dice(6)
        val diceRoll = dice.roll()
        //Actualización del valor de textView
        val diceImage: ImageView = findViewById(R.id.imageView3)
        //Selección de la imagen correcta
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        //Actualización de la imagen
        diceImage.setImageResource(drawableResource)
    }

}////////////////////////////////////////////////////////////////////////////////////////