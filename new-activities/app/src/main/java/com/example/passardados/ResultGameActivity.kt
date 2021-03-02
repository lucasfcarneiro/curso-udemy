package com.example.passardados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.passardados.databinding.ActivityResultGameBinding

private lateinit var binding: ActivityResultGameBinding

class ResultGameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultGameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val number = intent.getIntExtra("number", 0)

        checkResults(number)

        binding.backToGameButton.setOnClickListener {
            this.finish()
        }
    }

    private fun checkResults(a: Int) {
        if (a == 1) {
            binding.resultGameImageView.setImageResource(R.drawable.face_coin)
        } else binding.resultGameImageView.setImageResource((R.drawable.crown_coin))
    }
}
