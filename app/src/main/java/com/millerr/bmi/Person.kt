package com.millerr.bmi

class Person constructor(val name: String, val weight: Float, val height: Float) {
    fun bmi(): Float {
        var bmi = weight / (height * height)
        return bmi
    }

    fun hello() {
        println("Hello")
    }
}