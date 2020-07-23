package com.example.quickgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.random.Random.Default.nextInt


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rockHandImageView.setOnClickListener{chosenRock()}
        paperHandImageView.setOnClickListener{chosenPaper()}
        scissorHandImageView.setOnClickListener {chosenScissor()}
        }


    fun optionChosen (){

    }
    private fun chosenRock (){
        resultText.text = "escolhido pedra"

    }
    private fun chosenPaper(){
        resultText.text = "escolhido papel"
    }
    private fun chosenScissor(){
        resultText.text = "escolhido tesoura"
    }

    fun IntRange.random() =
        Random().nextInt((endInclusive + 1) - start) + start







    }



