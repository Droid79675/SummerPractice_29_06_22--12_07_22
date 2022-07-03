package com.example.practice_1_07_22

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.practice_1_07_22.CarRepository
class CarInfoFragment : Fragment(R.layout.fragment_car_info) {
    private var textViewName: TextView? = null
    private var textViewWeight: TextView? = null
    private var textViewEngine: TextView? = null
    private var textViewGasTank: TextView? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val id: Int = arguments?.getString(ARG_TEXT).orEmpty().toInt()
        val car = CarRepository.cars[id]
        val name = car.name
        val weight = car.weight
        val engine = car.engine
        val gasTank = car.gasTank

        textViewName = view.findViewById(R.id.tv_name)
        textViewName?.text = name
        textViewWeight = view.findViewById(R.id.tv_weight)
        textViewWeight?.text = "$weight кг"
        textViewEngine = view.findViewById(R.id.tv_engine)
        textViewEngine?.text = "$engine л.с."
        textViewGasTank = view.findViewById(R.id.tv_gasTank)
        textViewGasTank?.text = "$gasTank л"
    }


    companion object{
        private const val ARG_TEXT =""
        fun createBundle(id:String): Bundle {
            val bundle = Bundle()
            bundle.putString(
                ARG_TEXT,
                id
            )
            return bundle
        }

    }
}