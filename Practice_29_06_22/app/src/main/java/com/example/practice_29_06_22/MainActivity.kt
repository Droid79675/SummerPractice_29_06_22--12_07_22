package com.example.practice_29_06_22.first

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.practice_29_06_22.R

class MainActivity : AppCompatActivity() {


    private var editText1: EditText? = null
    private var editText2: EditText? = null
    private var editText3: EditText? = null
    private var editText4: EditText? = null
    private var image: ImageView? = null
    private var button: Button? = null
    private var textView: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
        return (if(name.length in 1..50 &&
            height in 1..250 &&
            weight > 0 && weight < 250.0 &&
            age in 1..150){
            val person = Person(name, height, weight, age)
            textView?.setText("Ответ: " + person.calculateSmth())
        } else{
            textView?.setText("Данные введены не корректно")
        })!!

    }
}
