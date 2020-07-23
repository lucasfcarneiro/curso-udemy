package com.example.quickgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var escolhaApp = Random.nextInt(0, 2)

        rockHandImageView.setOnClickListener {
            var pedra = 0
            escolher(pedra,escolhaApp)
        }
        paperHandImageView.setOnClickListener {
            var papel = 1
            escolher(papel,escolhaApp)
        }
        scissorHandImageView.setOnClickListener {
            var tesoura = 2
            escolher(tesoura,escolhaApp)
        }

        if (escolhaApp == 0) {//app ganhador
            appChoiceImageView.setImageResource(R.drawable.rock_hand)
        } else if (escolhaApp == 1) {//usuario ganhador
            appChoiceImageView.setImageResource(R.drawable.paper_hand)
        } else {//empate
            appChoiceImageView.setImageResource(R.drawable.scissors_hand)
        }



    }
}


fun escolher(escolhaUsu : Int, escolhaApp : Int) : Int{

    if (   (escolhaApp == 0 && escolhaUsu == 2)  ||  (escolhaApp == 2 && escolhaUsu == 1)  || (escolhaApp == 0 && escolhaUsu == 2))
        
    {                 //app ganhador

    } else if () {//usuario ganhador

    } else {//empate

    }

    return escolhaApp
}












