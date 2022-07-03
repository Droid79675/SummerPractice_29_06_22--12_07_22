package com.example.practice_1_07_22

import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.practice_1_07_22.databinding.ItemCarBinding

class CarHolder (
    private val binding: ItemCarBinding,
    private val glide: RequestManager,
    private val onItemClick: (Car) -> Unit,
    ) : RecyclerView.ViewHolder(binding.root) {

        private val options: RequestOptions = RequestOptions()
            .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)

        fun onBind(car: Car) {
            with(binding) {
                tvName.text = car.name
                val id = car.id
                root.setOnClickListener {
                    onItemClick(car)
                    btnCar.findNavController().navigate(R.id.action_carFragment_to_carInfoFragment,
                    CarInfoFragment.createBundle(id.toString()))
                }

                glide
                    .load(car.url)
                    .placeholder(R.drawable.img)
                    .error(R.drawable.img)
                    .into(ivCover)
            }
        }




}