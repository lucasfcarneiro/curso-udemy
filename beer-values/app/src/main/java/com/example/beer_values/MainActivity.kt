package com.example.beer_values

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calcButton.setOnClickListener { calcular()}

    }

    private fun calcular (){
        if (Ml250Radio.isChecked){
            calc(250)
        }
        if (Ml350Radio.isChecked){
            calc(350)
        }
        if (Ml473Radio.isChecked){
            calc(473)
        }
        if (Ml600Radio.isChecked){
            calc(600)
        }


    }


    private fun calc(x:Int){
        val qtdlata = 1000 / x
        val preçoLitro = qtdlata * firstPriceEditText.text.toString().toDouble()
        resultFirstTextView.text = "O preço do litro é: $preçoLitro reais"
        if (Ml250Radio2.isChecked){
            calc2(250)
        }
        if (Ml350Radio2.isChecked){
            calc2(350)
        }
        if (Ml473Radio2.isChecked){
            calc2(473)
        }
        if (Ml600Radio2.isChecked){
            calc2(600)
        }
    }
    private fun calc2(x:Int){
        val qtdlata = 1000 / x
        val preçoLitro = qtdlata * firstPriceEditText.text.toString().toDouble()
        resultSecondTextView.text = "O preço do litro é: $preçoLitro reais"

    }



}