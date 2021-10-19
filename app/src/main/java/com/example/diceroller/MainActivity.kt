package com.example.diceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var dice1Image: ImageView
    lateinit var dice2Image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ROLL BUTTON
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        dice1Image = findViewById(R.id.dice1_image)
        dice2Image = findViewById(R.id.dice2_image)

        // CLEAR BUTTON
        var clearButton: Button = findViewById(R.id.clear_button)
        clearButton.setOnClickListener { clear() }

        // COUNT UP BUTTON (FUN COUNTUP)
        //val countUpButton : Button = findViewById(R.id.countUp_button)
        //countUpButton.setOnClickListener { countUp() }
    }

    private fun rollDice() {
        //Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
        //val resultText: TextView = findViewById(R.id.result_text)
        //resultText.text = "Dice Rolled!"

        dice1Image.setImageResource(getRandomDiceImage())
        dice2Image.setImageResource(getRandomDiceImage())
    }
/*
    private fun countUp() {
        //val resultText: TextView = findViewById(R.id.result_text)

        if (resultText.text == "Hello World!") {
            resultText.text = "1"
        } else {
            var value = resultText.text.toString().toInt()
            if (value < 6) {
                value++
                resultText.text = value.toString()
            }
        }
    }
 */

    private fun getRandomDiceImage(): Int {
        val randomInt = (1..6).random()

        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    private fun clear(){
        dice1Image.setImageResource(R.drawable.empty_dice)
        dice2Image.setImageResource(R.drawable.empty_dice)
    }


}