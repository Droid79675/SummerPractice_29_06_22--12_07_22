package com.example.practice_29_06_22.second

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.practice_29_06_22.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class SingleActivity : AppCompatActivity(){

    private lateinit var controller: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single)
        controller = (supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment).navController
        val bottomView = findViewById<BottomNavigationView>(R.id.bottom_view)
        bottomView.setupWithNavController(controller)
    }
}