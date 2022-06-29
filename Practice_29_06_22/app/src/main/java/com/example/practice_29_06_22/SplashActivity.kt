package com.example.practice_29_06_22

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import java.lang.Exception
import kotlin.random.Random

class SplashActivity: Activity() {

    private var editText1: EditText? = null
    private var editText2: EditText? = null
    private var editText3: EditText? = null
    private var editText4: EditText? = null
    private var image: ImageView? = null
    private var button: Button? = null
    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        image = findViewById(R.id.iv_funnyPicture)
        textView = findViewById(R.id.tv_splash)
        editText1 = findViewById(R.id.et_inputWindow_name)
        editText2 = findViewById(R.id.et_inputWindow_height)
        editText3 = findViewById(R.id.et_inputWindow_weight)
        editText4 = findViewById(R.id.et_inputWindow_age)
        button = findViewById(R.id.btn_login)
        button?.setOnClickListener{
            validation()
        }
    }

    fun validation() {
        val name = editText1?.text.toString()
        val height:Int = if(editText2?.text?.isNotEmpty() == true) editText2?.text.toString().toInt()
        else 0
        val weight:Double = if(editText3?.text?.isNotEmpty() == true) editText3?.text.toString().toDouble()
        else 0.0
        val age:Int = if(editText4?.text?.isNotEmpty() == true) editText4?.text.toString().toInt()
        else 0
        val person = Person(name, height, weight, age)
        var value:Double = person.calculateSmth()
        return (if(person.name.length in 1..50 &&
            person.height in 1..250 &&
            person.weight in 1.0..250.0 &&
            person.age in 1..150){
            textView?.setText("Ответ: $value")
        } else{
            textView?.setText("Данные введены не корректно")
        })!!

    }
}