package com.example.quickgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rockHandImageView.setOnClickListener {
            var escolhaUsu = 0
            var escolhaApp = Random.nextInt(0, 3)

            AlteraImageView(escolhaApp)
            respostaTextView.setText("app $escolhaApp,  usu $escolhaUsu")
            VerificaVencedor(escolhaApp,escolhaUsu)
        }
        paperHandImageView.setOnClickListener {
            var escolhaUsu = 1
            var escolhaApp = Random.nextInt(0, 3)
            AlteraImageView(escolhaApp)
            respostaTextView.setText("app $escolhaApp,  usu $escolhaUsu")
            VerificaVencedor(escolhaApp,escolhaUsu)
        }
        scissorHandImageView.setOnClickListener {
            var escolhaUsu = 2
            var escolhaApp = Random.nextInt(0, 3)
            AlteraImageView(escolhaApp)
            respostaTextView.setText("app $escolhaApp,  usu $escolhaUsu")
            VerificaVencedor(escolhaApp,escolhaUsu)
        }









       /*
       fun  FuncaoSemRetorno(x : Int): Unit
        {

        }

        fun funcaoComRetorno ( x : Int): Int
        {

            return x + 5
        }

        */



    }//Funçoes abaixo

    private fun VerificaVencedor (escolhaApp : Int, escolhaUsu : Int ): Unit
    {
        if ((escolhaApp == 0 && escolhaUsu == 2) ||
            (escolhaApp == 2 && escolhaUsu == 1) ||
            (escolhaApp == 1 && escolhaUsu == 0)
        ) {
            resultText.text = "Voce perdeu"
        } else if ((escolhaUsu == 0 && escolhaApp == 2) ||
            (escolhaUsu == 2 && escolhaApp == 1) ||
            (escolhaUsu == 1 && escolhaApp == 0)
        ) {
            resultText.text = "Voce ganhou"
        } else {
            resultText.text = "empate"
        }
    }
    private fun AlteraImageView (x : Int): Unit
    {
        if (x == 0) {
            appChoiceImageView.setImageResource(R.drawable.rock_hand)
        } else if (x == 1) {
            appChoiceImageView.setImageResource(R.drawable.paper_hand)
        } else {
            appChoiceImageView.setImageResource(R.drawable.scissors_hand)
        }
    }
}















