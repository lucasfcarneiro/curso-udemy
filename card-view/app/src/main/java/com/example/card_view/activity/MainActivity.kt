package com.example.card_view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.card_view.adapter.Post
import com.example.card_view.adapter.PostAdapter
import com.example.card_view.databinding.ActivityMainBinding
import com.example.card_view.databinding.PostItemBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var  postAdapter: PostAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        postAdapter = PostAdapter(Post.DUMBLIST)
        binding.postRecyclerView.adapter = postAdapter
    }
}