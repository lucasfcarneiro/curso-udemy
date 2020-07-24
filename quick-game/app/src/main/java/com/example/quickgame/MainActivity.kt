package com.example.quickgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rockHandImageView.setOnClickListener {rock(0)}
        paperHandImageView.setOnClickListener {paper(1)}
        scissorHandImageView.setOnClickListener {scissor(2)}

    }//Funçoes abaixo

    /*
       fun  FuncaoSemRetorno(x : Int): Unit
        {

        }
        fun funcaoComRetorno ( x : Int): Int
        {

            return x + 5
        }
        */

    private fun checkWinner (app : Int, user : Int ): Unit
    {
        if ((app == 0 && user == 2) ||
            (app == 2 && user == 1) ||
            (app == 1 && user == 0)
        ) {
            resultTextView.text = "Voce perdeu"
        } else if ((user == 0 && app == 2) ||
            (user == 2 && app == 1) ||
            (user == 1 && app == 0)
        ) {
            resultTextView.text = "Voce ganhou"
        } else {
            resultTextView.text = "empate"
        }
    }
    private fun setAppImageView (x : Int): Unit
    {
        if (x == 0) {
            appChoiceImageView.setImageResource(R.drawable.rock_hand)
        } else if (x == 1) {
            appChoiceImageView.setImageResource(R.drawable.paper_hand)
        } else {
            appChoiceImageView.setImageResource(R.drawable.scissors_hand)
        }
    }
    private fun rock (userChoice : Int): Unit
    {
        var appChoice = Random.nextInt(0, 3)
        setAppImageView(appChoice)
        checkWinner(appChoice,userChoice)
    }
    private fun paper (userChoice : Int): Unit
    {
        var appChoice = Random.nextInt(0, 3)
        setAppImageView(appChoice)
        checkWinner(appChoice,userChoice)
    }
    private fun scissor (userChoice : Int): Unit
    {
        var appChoice = Random.nextInt(0, 3)
        setAppImageView(appChoice)
        checkWinner(appChoice,userChoice)
    }
}















