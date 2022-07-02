package com.example.practice_29_06_22.first


 data class Person(var name:String, var height:Int, var weight:Double, var age:Int) {

    fun calculateSmth(): Double{
        val res: Double = if(this.age >= 18){
            (this.name.length * this.weight * 1.8)/(this.age + this.height * 1.1)
        } else{
            (this.name.length * this.weight * 0.9)/(this.age + this.height * 1.4)
        }
        return res
    }
}