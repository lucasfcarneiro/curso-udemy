package com.example.recycler_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycler_view.adapter.Movie
import com.example.recycler_view.adapter.MovieListAdapter
import com.example.recycler_view.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var movieListAdapter : MovieListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //config recycler view

        movieListAdapter = MovieListAdapter(Movie.DUMBLIST)
        //binding.movieRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.movieRecyclerView.adapter = movieListAdapter

    }//funcao



}


