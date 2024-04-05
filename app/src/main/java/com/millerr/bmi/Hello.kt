package com.millerr.bmi

class Hello {

}

//筆記：val設定值後不可以改變，不可以再次assign
//筆記：var設定值後可以再次改變，可以再次assign
fun main() {
    println("Hello Kotlin！")
    //Byte, Short, Int, Long
    val age = 20
    val population = 9999L
    println(age.inc())
    println(age)
    var name = "millerr"
    println(name.get(1))
    name = "Barry"
    println(name)
    //Floot(32), Double(64)
    val weight: Float = 65.5f
    //true , false
    val isAdult = false
    //Char
    val c = 'A'
}