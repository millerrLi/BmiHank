package com.millerr.bmi

import kotlin.random.Random
import kotlin.random.nextInt

/*---------------------------------------
物件導向三大特性：
1、Inheritance 繼承
2、Polymorphism多型
3、Encapsulation封裝
---------------------------------------*/

class GuessGame {
    var secret: Int = Random.nextInt(1 until 11)
    var counter = 0
    fun guess(n: Int): Int {
        counter++
        return n - secret
    }
    fun reset(){
        secret = Random.nextInt(1 until 11)
        counter = 0
    }
}

fun main() {
    val game = GuessGame()
    val num = 3
    var result = game.guess(num)
}