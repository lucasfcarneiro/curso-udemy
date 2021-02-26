package com.example.passardados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.passardados.databinding.ActivityGameBinding
import kotlin.random.Random


private lateinit var binding: ActivityGameBinding

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.playButton.setOnClickListener {
            val intent = Intent(this, ResultGameActivity::class.java)

            val randomNumber = Random.nextInt(2)
            intent.putExtra("number", randomNumber)
            startActivity(intent)
        }
    }
}