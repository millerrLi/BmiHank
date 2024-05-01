package com.millerr.bmi

import kotlin.random.Random

fun main() {
    //Ctrl + P 列出方法裡面的參數
    //Ctrl + Q 顯示參數的簡易手冊，Ctrl + QQ較完整的參數手冊
//    println(Random.nextInt(1, 11))
//    println((1..10).random())
    //上面2個取亂數的方法，老師比較喜歡第2個，比較直覺
    val secret = (1..10).random()
    println("Secret: ${secret}")
    var num: Int = 0
//    while (num != secret) {
    var bingo = false
    for (i in 1..3){
        print("please enter a number(1-10)：")
        val input = readLine()
        num = input?.toIntOrNull() ?: 0
        println("The number you entered: $num")
        if (num < secret) {
            println("bigger")
        } else if (num > secret) {
            println("smaller")
        } else {
            println("You got it!")
            bingo = true
            break
        }
    }
    if (!bingo) println("Fail, the Secret is $secret")
}