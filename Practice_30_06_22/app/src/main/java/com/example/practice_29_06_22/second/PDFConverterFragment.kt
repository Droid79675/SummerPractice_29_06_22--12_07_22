package com.example.practice_29_06_22.second

import android.os.Bundle
import android.text.style.TtsSpan
import android.view.View
import androidx.fragment.app.Fragment
import com.example.practice_29_06_22.R
import com.google.android.material.snackbar.Snackbar


class PDFConverterFragment : Fragment(R.layout.fragment_pdf_file_converter) {




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = arguments?.getString(TtsSpan.ARG_TEXT).orEmpty()

        if (text.isNotEmpty()) {
            Snackbar.make(view, text, Snackbar.LENGTH_LONG).show()

        }
    }





    companion object{
        private const val ARG_TEXT ="bimbimbombom"
        fun createBundle(className: String): Bundle {
            val bundle = Bundle()
            bundle.putString(
                className,
                ARG_TEXT
            )
            return bundle
        }

    }

    

}
