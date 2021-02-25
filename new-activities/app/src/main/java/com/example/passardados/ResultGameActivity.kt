package com.example.passardados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.passardados.databinding.ActivityResultGameBinding
import kotlin.random.Random

private lateinit var binding: ActivityResultGameBinding

class ResultGameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultGameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val randomNumber: Int = Random.nextInt(2)

        if (randomNumber == 1){
            binding.resultGameImageView.setImageResource(R.drawable.face_coin)
        }else binding.resultGameImageView.setImageResource((R.drawable.crown_coin))

        binding.backToGameButton.setOnClickListener{
            val intent = Intent (this, GameActivity::class.java)
            startActivity(intent)
        }
    }
}