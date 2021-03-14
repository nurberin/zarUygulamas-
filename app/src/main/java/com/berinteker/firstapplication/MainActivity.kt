package com.berinteker.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sayiText1 : TextView = findViewById(R.id.sayiText1)
        val zarImage1 : ImageView = findViewById(R.id.zarImage1)

        val sayiText2 : TextView = findViewById(R.id.sayiText2)
        val zarImage2 : ImageView = findViewById(R.id.zarImage2)

        val sallaButton : Button = findViewById(R.id.sallaButton)
        val temizleButton : Button = findViewById(R.id.temizleButton)

        temizleButton.setOnClickListener {
            zarImage1.setImageResource(R.drawable.empty_dice)
            zarImage2.setImageResource(R.drawable.empty_dice)
            sayiText1.text = "-"
            sayiText2.text = "-"

        }

        sallaButton.setOnClickListener {
            val randomSayı1 = (1..6).random()
            val randomSayı2 = (1..6).random()

            sayiText1.text = randomSayı1.toString()
            sayiText2.text = randomSayı2.toString()

            when(randomSayı1){
                1-> zarImage1.setImageResource(R.drawable.dice_1)
                2-> zarImage1.setImageResource(R.drawable.dice_2)
                3-> zarImage1.setImageResource(R.drawable.dice_3)
                4-> zarImage1.setImageResource(R.drawable.dice_4)
                5-> zarImage1.setImageResource(R.drawable.dice_5)
                else-> zarImage1.setImageResource(R.drawable.dice_6)
            }

            when(randomSayı2){
                1-> zarImage2.setImageResource(R.drawable.dice_1)
                2-> zarImage2.setImageResource(R.drawable.dice_2)
                3-> zarImage2.setImageResource(R.drawable.dice_3)
                4-> zarImage2.setImageResource(R.drawable.dice_4)
                5-> zarImage2.setImageResource(R.drawable.dice_5)
                else-> zarImage2.setImageResource(R.drawable.dice_6)
            }
        }
    }
}