package com.example.fragments.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragments.R
import com.example.fragments.databinding.ActivityMainBinding
import com.example.fragments.fragments.ChatFragment
import com.example.fragments.fragments.ContactFragment


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        val chatFragment = ChatFragment()
        val contactFragment = ContactFragment()

        binding.chatButton.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.mainFrameLayoutFragment, chatFragment)
                //addToBackStack(null)    **para criar pilha de frag e ao clicar voltar nao fechar o app
                commit()
            }
        }
        binding.contactButton.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.mainFrameLayoutFragment, contactFragment)
                commit()
            }
        }

    }


}