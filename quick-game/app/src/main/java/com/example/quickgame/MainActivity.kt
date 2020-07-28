package com.example.quickgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random
import com.example.quickgame.ChoiceOptions.ROCK
import com.example.quickgame.ChoiceOptions.PAPER
import com.example.quickgame.ChoiceOptions.SCISSORS
import java.lang.NullPointerException


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUserChoice()

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

    private fun checkWinner(app: ChoiceOptions, user: ChoiceOptions) {
        if ((app == ROCK && user == SCISSORS) ||
            (app == SCISSORS && user == PAPER) ||
            (app == PAPER && user == ROCK)
        ) {
            resultTextView.text = getString(R.string.you_lose)
        } else if ((user == ROCK && app == SCISSORS) ||
            (user == SCISSORS && app == PAPER) ||
            (user == PAPER && app == ROCK)
        ) {
            resultTextView.text = getString(R.string.you_win)
        } else {
            resultTextView.text = getString(R.string.draw)
        }
    }

    private fun setAppChoice(): ChoiceOptions {
        var appChoice = ChoiceOptions.NULL
        when (Random.nextInt(3)) {
            0 -> {
                appChoiceImageView.setImageResource(R.drawable.rock_hand)
                appChoice = ROCK
            }
            1 -> {
                appChoiceImageView.setImageResource(R.drawable.paper_hand)
                appChoice = PAPER
            }
            2 -> {
                appChoiceImageView.setImageResource(R.drawable.scissors_hand)
                appChoice = SCISSORS
            }
        }
        return appChoice
    }

    private fun setUserChoice() {
        rockHandImageView.setOnClickListener {
            checkWinner(setAppChoice(), ROCK)
        }
        paperHandImageView.setOnClickListener {
            checkWinner(setAppChoice(), PAPER)
        }
        scissorHandImageView.setOnClickListener {
            checkWinner(setAppChoice(), SCISSORS)
        }
    }
}















