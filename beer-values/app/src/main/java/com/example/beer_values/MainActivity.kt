package com.example.beer_values

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*Ml250Button.setOnClickListener { calc250(250) }
        Ml350Button.setOnClickListener { calc350(350) }
        Ml473Button.setOnClickListener { calc473(473) }
        Ml600Button.setOnClickListener { calc600(600) }

         */
        calcButton.setOnClickListener { calcular()}
    }

    private fun calcular (){
        if (Ml250Radio.isChecked){
            calc250(250)
        }
        if (Ml350Radio.isChecked){
            calc350(350)
        }
        if (Ml473Radio.isChecked){
            calc473(473)
        }
        if (Ml600Radio.isChecked){
            calc600(600)
        }
    }


    private fun calc250(x:Int){
        val qtdlata = 1000 / x
        val preçolitro = unitValueTextView.text.toString().toDouble() * qtdlata
        resultFirstBeerTextView.text = "Preço por litro: $preçolitro"
    }
    private fun calc350(x:Int){
        val qtdlata = 1000 / x
        val preçoLitro = unitValueTextView.text.toString().toDouble() * qtdlata
        resultFirstBeerTextView.text = "Preço por litro: $preçoLitro"
    }
    private fun calc473(x:Int){
        val qtdlata = 1000 / x
        val preçoLitro = unitValueTextView.text.toString().toDouble() * qtdlata
        resultFirstBeerTextView.text = "Preço por litro: $preçoLitro"
    }
    private fun calc600(x:Int){
        val qtdlata = 1000 / x
        val preçoLitro = unitValueTextView.text.toString().toDouble() * qtdlata
        resultFirstBeerTextView.text = "Preço por litro: $preçoLitro"

    }


}