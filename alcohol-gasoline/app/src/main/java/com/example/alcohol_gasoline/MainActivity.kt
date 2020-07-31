package com.example.alcohol_gasoline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calcButton.setOnClickListener { getPrices() }



    }

    private fun getPrices(){
        val alcoholPrice = alcoolEditText.text.toString().toDouble()
        val gasolinePrice = gasolinaEditText.text.toString().toDouble()

        var divisao = gasolinePrice / alcoholPrice
        if(divisao <= 0.7){
            resultTextView.text = "Melhor o alcool"
        }else {
            resultTextView.text = "Melhor a gasolina"
        }
        limpar()
    }
    private fun limpar ( ){
        alcoolEditText.cleaTextView
    }
}