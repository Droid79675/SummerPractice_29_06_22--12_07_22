package com.example.practice_29_06_22.second

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.practice_29_06_22.R
import com.example.practice_29_06_22.databinding.FragmentCalculatorBinding
import com.example.practice_29_06_22.databinding.FragmentClockBinding

class CalculatorFragment : Fragment(R.layout.fragment_calculator) {
    private var _binding: FragmentCalculatorBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentCalculatorBinding.bind(view)
        with(binding){
            val className = FileDispatcherFragment::class.qualifiedName
            btnFileDispatcher.setOnClickListener {
                findNavController().navigate(
                    R.id.action_calculatorFragment_to_PDFConverter,
                    PDFConverterFragment.createBundle(className))

            }
        }
    }

}