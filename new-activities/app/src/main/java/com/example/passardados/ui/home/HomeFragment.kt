package com.example.passardados.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.passardados.GameActivity
import com.example.passardados.R
import com.example.passardados.SecondActivity
import com.example.passardados.databinding.FragmentHomeBinding
import com.example.passardados.extensions.showSnackBar

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        handleButtonClick()
    }

    private fun handleButtonClick() {
        binding.nextActivityButton.setOnClickListener{
            val intent = Intent (activity , SecondActivity::class.java)
            startActivity(intent)
        }
        binding.goToGameButton.setOnClickListener{
            val intent = Intent (activity, GameActivity::class.java)
            startActivity(intent)
        }
        binding.snackBarButton.setOnClickListener{
            activity?.showSnackBar(it, getString(R.string.app_name),requireContext())
        }
    }
}