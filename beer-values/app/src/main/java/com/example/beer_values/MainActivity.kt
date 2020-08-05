package com.example.beer_values

import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.roundToInt


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calcButton.setOnClickListener {
            val firstRadioButtonValue = checkRadioButtonSelection(radioGroup)
            val secondRadioButtonValue = checkRadioButtonSelection(radioGroup2)
            val PLitro1 = calcular(firstRadioButtonValue)
            val PLitro2 = calcular(secondRadioButtonValue)
            resultFirstTextView.text = "O preço do litro é: ${String.format("%.2f", PLitro1)} reais"
            resultSecondTextView.text = "O preço do litro é: ${PLitro2 } reais"
            if (PLitro1 > PLitro2) {
                resultFinalTextView.text = "Melhor comprar o $PLitro2"
            } else resultFinalTextView.text = "Melhor comprar o $PLitro1"
        }

    } //função


    private fun calcular(x: Double): Double {
        val qtdlata: Double = (1000 / x)
        val preçoLitro = qtdlata * firstPriceEditText.text.toString().toDouble()
        return preçoLitro
    }

    private fun checkRadioButtonSelection(radioGroup: RadioGroup): Double {

        return when (findViewById<View>(radioGroup.checkedRadioButtonId) as RadioButton) {
            Ml250Radio, Ml250Radio2 -> {
                250.0
            }
            Ml350Radio, Ml350Radio2 -> {
                350.0
            }
            Ml473Radio, Ml473Radio2 -> {
                473.0
            }
            Ml600Radio, Ml600Radio2 -> {
                600.0
            }
            else -> {
                0.0
            }
        }
    }
}


