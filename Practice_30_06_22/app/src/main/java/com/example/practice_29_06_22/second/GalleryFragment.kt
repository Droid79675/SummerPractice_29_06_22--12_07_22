package com.example.practice_29_06_22.second

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.practice_29_06_22.R
import com.example.practice_29_06_22.databinding.FragmentFileDispatcherBinding
import com.example.practice_29_06_22.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment(R.layout.fragment_gallery) {
    private var _binding: FragmentGalleryBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentGalleryBinding.bind(view)
        with(binding){
            val className = FileDispatcherFragment::class.qualifiedName
            btnFileDispatcher.setOnClickListener {
                findNavController().navigate(
                    R.id.action_galleryFragment_to_PDFConverter,
                    PDFConverterFragment.createBundle(className))

            }
        }
    }
}