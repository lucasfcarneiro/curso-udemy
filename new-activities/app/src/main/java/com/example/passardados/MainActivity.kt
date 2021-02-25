package com.example.passardados
import android.content.Intent
import com.example.passardados.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


private lateinit var binding : ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextActivityButton.setOnClickListener{
            val intent = Intent (this , SecondActivity::class.java)
            startActivity(intent)
        }
        binding.goToGameButton.setOnClickListener{
            val intent = Intent ( this, GameActivity::class.java)
            startActivity(intent)
        }

    }
}