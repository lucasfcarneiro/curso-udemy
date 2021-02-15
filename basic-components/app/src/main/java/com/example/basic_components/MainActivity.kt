package com.example.basic_components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendButton.setOnClickListener { sendMessage() }
        cleanButton.setOnClickListener { cleanMessage() }

    }

    private fun sendMessage() {
        
        //checkBox()
        radioButton()
        /*
        val x = nameInputEditText.text.toString()
        val y = emailInputEditText.text.toString()
        resultTextView.text = "Nome: $x Email: $y"
         */
    }

    private fun cleanMessage() {
        resultTextView.text = ""
        emailInputEditText.setText("")
        nameInputEditText.setText("")
    }

    private fun checkBox() {
        var teste = ""
        if (greenCheckBox.isChecked) {
            resultTextView.text = "Verde selecionado"
            teste = "Verde"
        }
        if (redCheckBox.isChecked) {
            resultTextView.text = "$teste vermelho selecionado"
            teste = "vermelho"

        }
        if (blueCheckBox.isChecked) {
            resultTextView.text = "$teste  azul selecionado"
        }
    }

    private fun radioButton() {
        if (radioMan.isChecked) {
            resultTextView.text = "homem"
        } else if (radioWoman.isChecked) resultTextView.text = "mulher "
    }



}