package com.example.practice_29_06_22.second

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.core.content.edit
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.practice_29_06_22.R
import com.example.practice_29_06_22.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainBinding.bind(view)
        with(binding){
            btnPDFConverter.setOnClickListener{
                findNavController().navigate(R.id.action_mainFragment_to_PDFConverter)
            }
        }

    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}