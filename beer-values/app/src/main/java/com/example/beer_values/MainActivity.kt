package com.example.beer_values

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calcButton.setOnClickListener {

            val firstRadioButtonValue = checkRadioButtonSelection(firstRadioGroup)
            val secondRadioButtonValue = checkRadioButtonSelection(secondRadioGroup)

            val firstLiterPrice = calculatePrice(firstRadioButtonValue,firstPriceEditText)
            val secondLiterPrice = calculatePrice(secondRadioButtonValue,secondPriceEditText)

            resultFirstTextView.text = "O preço do litro é: ${String.format("%.2f", firstLiterPrice)} reais"
            resultSecondTextView.text = "O preço do litro é: ${String.format("%.2f", secondLiterPrice)} reais"
            when {
                firstLiterPrice > secondLiterPrice -> {
                    resultFinalTextView.text = "Melhor comprar a segunda opção: ${secondRadioButtonValue.toInt()} ML"
                }
                firstLiterPrice == secondLiterPrice -> {
                    resultFinalTextView.text = "Os preços são iguais"
                }
                else -> resultFinalTextView.text = "Melhor comprar a primeira opção: ${firstRadioButtonValue.toInt()} ML"
            }

            it.hideKeyboard()
        }

        cleanButton.setOnClickListener { cleanFields() }

    } //função

    private fun calculatePrice(canValue: Double, unitPrice: TextInputEditText): Double {
        val numberOfCans = 1000 / canValue
        return numberOfCans * unitPrice.text.toString().toDouble()
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
    private fun cleanFields (){
        firstPriceEditText.setText("")
        secondPriceEditText.setText("")
        resultFirstTextView.text = ""
        resultSecondTextView.text = ""
        resultFinalTextView.text = ""
        secondRadioGroup.clearCheck()
        firstRadioGroup.clearCheck()
    }

    fun View.hideKeyboard() {
        val inputManager = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputManager.hideSoftInputFromWindow(windowToken, 0)
    }


}


