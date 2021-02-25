package com.example.fragments.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragments.R
import com.example.fragments.databinding.ActivityMainBinding

private lateinit var binding : ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }


}