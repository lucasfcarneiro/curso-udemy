package com.lucasfcarneiro.first_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        changeText()
    }

    private fun changeText()
    {
        butaoButton.setOnClickListener{
            val x = Random.nextInt(0, 20)
            noNumberChosen.text = "$x"
        }
    }


}
