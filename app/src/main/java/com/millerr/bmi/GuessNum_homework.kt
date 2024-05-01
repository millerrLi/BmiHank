package com.millerr.bmi

fun main() {
    println("歡迎來到猜數字遊戲，數字範圍為1~10，那就開始吧")
    //設定相關會用到的參數
    val secret = (1..10).random()
    var guessNum: Int = 0
    var biggerNum = 10
    var smallerNum = 1
    var counter = 1
    //println("secret: $secret")

    while (secret != guessNum) {
        print("請輸入 $smallerNum 到 $biggerNum 的數字： ")
        guessNum = readLine()?.toIntOrNull() ?: 0
        if (guessNum < secret) {
            println("您猜的數字為 $guessNum, 太小了，請再加油！")
            if (guessNum < 1) smallerNum = smallerNum
            else smallerNum = guessNum + 1
        } else if (guessNum > secret) {
            println("您猜的數字為 $guessNum, 太大了，請再加油！")
            if (guessNum > 10) biggerNum = biggerNum
            else biggerNum = guessNum - 1
        } else {
            println("您猜的數字為 $guessNum, 猜對了，恭喜你了")
            //看看幾次猜中
            if (counter < 3) println("您一共猜了 $counter 次，真厲害！")
            else if (counter >= 3 && counter <= 5) println("您一共猜了 $counter 次，不錯唷！")
            else println("您一共猜了 $counter 次，運氣有點背唷！")
        }
        counter++
    }
}