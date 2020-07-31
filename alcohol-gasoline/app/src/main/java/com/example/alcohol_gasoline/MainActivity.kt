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

       val fieldValidated = validateFields(alcoholPrice,gasolinePrice)
        if(fieldValidated){
            val division = alcoholPrice / gasolinePrice
            if(division <= 0.7){
                resultTextView.text = getString(R.string.betterAlcohol)
            }
            else resultTextView.text = getString(R.string.betterGasoline)
        }
    }
    private fun validateFields (x: Double, y : Double ): Boolean{
        var isValid = true
        if(x.equals("")){
            isValid = false
        }else if (y.equals("")){
            isValid = false
        }
        return isValid
    }

}