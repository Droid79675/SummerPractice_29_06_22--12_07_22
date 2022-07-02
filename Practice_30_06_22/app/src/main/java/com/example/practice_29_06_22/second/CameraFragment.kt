package com.example.practice_29_06_22.second

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.practice_29_06_22.R
import com.example.practice_29_06_22.databinding.FragmentCameraBinding
import com.example.practice_29_06_22.databinding.FragmentClockBinding

class CameraFragment : Fragment(R.layout.fragment_camera) {
    private var _binding: FragmentCameraBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentCameraBinding.bind(view)
        with(binding){
            val className = FileDispatcherFragment::class.qualifiedName
            btnFileDispatcher.setOnClickListener {
                findNavController().navigate(
                    R.id.action_cameraFragment_to_PDFConverter,
                    PDFConverterFragment.createBundle(className))

            }
        }
    }
}