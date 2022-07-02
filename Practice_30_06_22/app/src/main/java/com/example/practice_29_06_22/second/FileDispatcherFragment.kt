package com.example.practice_29_06_22.second

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.practice_29_06_22.R
import com.example.practice_29_06_22.databinding.FragmentFileDispatcherBinding


class FileDispatcherFragment : Fragment(R.layout.fragment_file_dispatcher) {
    private var _binding: FragmentFileDispatcherBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentFileDispatcherBinding.bind(view)
        with(binding){
            val className = Throwable()
                .stackTrace[0]
                .className
            btnFileDispatcher.setOnClickListener {
                findNavController().navigate(R.id.action_fileDispatcherFragment_to_PDFConverter,
                PDFConverterFragment.createBundle(className))

            }
        }
    }
}