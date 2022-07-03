package com.example.practice_1_07_22

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import com.example.practice_1_07_22.CarAdapter
import com.example.practice_1_07_22.CarRepository
import com.google.android.material.snackbar.Snackbar

import com.example.practice_1_07_22.databinding.FragmentCarBinding

class CarFragment: Fragment(R.layout.fragment_car) {
    private var _binding: FragmentCarBinding? = null


    private val binding get() = _binding!!

    private var adapter: CarAdapter? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentCarBinding.bind(view)

        initAdapter()
    }

    private fun initAdapter() {
        adapter = CarAdapter(
            CarRepository.cars,
            Glide.with(this),

        ){

        }
        binding.tvTitle.setOnClickListener{
            CarRepository.cars.removeAt(0)
            adapter?.updateData(CarRepository.cars)
        }
        binding.rvCars.adapter = adapter
        binding.rvCars.layoutManager = GridLayoutManager(requireContext(), 2)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}