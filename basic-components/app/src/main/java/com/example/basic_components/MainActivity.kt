package com.example.basic_components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendButton.setOnClickListener{sendMessage()}
    }
    fun sendMessage (){
        val x = nameInputEditText.text
        val y = emailInputEditText.text
        resultTextView.text = x.toString() + "," + y.toString()
    }

}