package com.example.practice_1_07_22

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.practice_1_07_22.databinding.FragmentMainBinding

class MainFragment: Fragment(R.layout.fragment_main){
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainBinding.bind(view)
        with(binding){
            btnCars.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_carsFragment)
            }

        }
    }


    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}