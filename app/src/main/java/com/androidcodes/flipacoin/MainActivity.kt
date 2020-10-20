package com.androidcodes.flipacoin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var coinPic: ImageView
    lateinit var coinText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flipButton: Button = findViewById(R.id.flipButton)
        flipButton.setOnClickListener {
            flipCoin()
        }

        coinPic = findViewById(R.id.coinImage)
        coinText = findViewById(R.id.coinText)
    }

    private fun flipCoin(){
        val random = Random.nextInt(2)+ 1
        val drawableRes = when(random){
            1 -> R.drawable.head
            2 -> R.drawable.tail
            else -> R.drawable.head
        }
        coinPic.setImageResource(drawableRes)

        val coinTextSet = when(random){
            1 -> "Head"
            2 -> "Tail"
            else -> "Head"
        }
        coinText.text = coinTextSet

    }
}