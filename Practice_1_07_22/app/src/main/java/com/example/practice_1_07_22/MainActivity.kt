package com.example.practice_1_07_22
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

import com.example.practice_1_07_22.R


class MainActivity : AppCompatActivity(){

    private lateinit var controller: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        controller = (supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment).navController

    }
}