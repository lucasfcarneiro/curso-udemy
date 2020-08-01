package com.example.beer_values

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calcButton.setOnClickListener {
            var selecao1 = verificarSelecionado1()
            var selecao2 = verificarSelecionado2()
            var PLitro1 = calcular(selecao1)
            var PLitro2 =calcular(selecao2)
            resultFirstTextView.text = "O preço do litro é: $PLitro1 reais"
            resultSecondTextView.text = "O preço do litro é: $PLitro2 reais"
            if(PLitro1 > PLitro2){
                resultFinalTextView.text="Melhor comprar o $PLitro2"
            }else resultFinalTextView.text="Melhor comprar o $PLitro1"
        }

    } //função


        private fun calcular(x: Double): Double {
            val qtdlata: Double = (1000 / x)
            val preçoLitro = qtdlata * firstPriceEditText.text.toString().toDouble()
            return preçoLitro
        }

        private fun verificarSelecionado1(): Double {
            if (Ml250Radio.isChecked) {
                var preço = 250.0
                return preço
            }
            if (Ml350Radio.isChecked) {
                var preço = 350.0
                return preço
            }
            if (Ml473Radio.isChecked) {
                var preço = 473.0
                return preço
            }
            if (Ml600Radio.isChecked) {
                var preço = 600.0
                return preço
            }
            return 0.0
        }

        private fun verificarSelecionado2(): Double {
            if (Ml250Radio2.isChecked) {
                var preço = 250.0
                return preço
            }
            if (Ml350Radio2.isChecked) {
                var preço = 350.0
                return preço
            }
            if (Ml473Radio2.isChecked) {
                var preço = 473.0
                return preço
            }
            if (Ml600Radio2.isChecked) {
                var preço = 600.0
                return preço
            }
            return 0.0
        }
    }


