package com.lucasfcarneiro.first_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        changeText()
    }

    public fun changeText() {


        butaoButton.setOnClickListener{
            clickBelowTextView.text = "Paralelepipedo"
        }
    }


}
