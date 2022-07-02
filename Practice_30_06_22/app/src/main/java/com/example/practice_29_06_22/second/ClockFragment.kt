package com.example.practice_29_06_22.second

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.practice_29_06_22.R
import com.example.practice_29_06_22.databinding.FragmentClockBinding
import com.example.practice_29_06_22.databinding.FragmentFileDispatcherBinding

class ClockFragment : Fragment(R.layout.fragment_clock) {
    private var _binding: FragmentClockBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentClockBinding.bind(view)
        with(binding){
            val className = FileDispatcherFragment::class.qualifiedName
            btnFileDispatcher.setOnClickListener {
                findNavController().navigate(
                    R.id.action_clockFragment_to_PDFConverter,
                    PDFConverterFragment.createBundle(className))

            }
        }
    }
}