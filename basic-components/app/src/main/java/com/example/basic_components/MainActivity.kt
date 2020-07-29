package com.example.basic_components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendButton.setOnClickListener{sendMessage()}
        cleanButton.setOnClickListener{cleanMessage()}
    }
    private fun  sendMessage (){
        val x = nameInputEditText.text.toString()
        val y = emailInputEditText.text.toString()
        resultTextView.text =  "$x, $y"
    }
    private fun cleanMessage (){
        resultTextView.text = ""
    }
}