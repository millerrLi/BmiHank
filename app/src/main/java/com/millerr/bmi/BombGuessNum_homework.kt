package com.millerr.bmi

fun main() {
    //設定使用到的參數
    var nums = mutableListOf<Int>()
    var secret = 0
    var yourNum = 0
    var bombs = mutableListOf<Int>()
    var bigNum = 100
    var minNum = 1
    var counter = 0
    var checkBombs = 0
    var flagCameOver = false
    //猜數字範圍為1~100
    for (i in 1..100) {
        nums.add(i)
    }
    nums.shuffle()
    //秘密數字
    secret = nums.removeAt(0)
    //炸彈有20顆
    while (bombs.size < 20) {
        bombs.add(nums.removeAt(0))
    }
    //遊戲開始
    println("歡迎來到猜數字遊戲！")
    println("遊戲中有${bombs.size}顆地雷，如果猜中地雷，會馬上爆掉喔！")
    while (secret != yourNum) {
        counter++
        print("請從${minNum} ~ ${bigNum}，猜1個數字：")
        yourNum = readLine()?.toIntOrNull() ?: 0
        println()
        //超過範圍的處理
        if (yourNum < minNum || yourNum > bigNum) {
            println("超出數字範圍，請重猜！")
            continue
        }
        //猜中地雷的處理
        for (bombNum in bombs) {
            if (yourNum == bombNum) {
                println("哇哇！你踩到地雷了！ㄅㄥˋ一咧真大聲，遊戲結束")
                flagCameOver = true
                break
            }
        }
        if (flagCameOver == true)  break
        //沒踩到地雷，遊戲繼續
        if (secret > yourNum) {
            minNum = yourNum + 1
            println("唉呀！沒猜中，範圍縮小至${minNum} ~ ${bigNum}")
        }else if (secret < yourNum){
            bigNum = yourNum -1
            println("唉呀！沒猜中，範圍縮小至${minNum} ~ ${bigNum}")
        }else{
            println("恭喜你猜中了，正解：${secret}")
            if (counter <= 5) println("您一共猜了${counter}次，好厲害")
            else if (counter > 5 && counter <= 10) println("您一共猜了${counter}次，不錯唷")
            else println("您一共猜了${counter}次，再加油囉！")
            continue
        }
        //依使用者的數字清除不會用到的地雷
        while (bombs.size != checkBombs){
            if (bombs.get(checkBombs) > bigNum || bombs.get(checkBombs) < minNum){
                bombs.removeAt(checkBombs)
            }else checkBombs++
        }
        println("好消息~ 地雷剩下${bombs.size}顆！")
        checkBombs =0
    }
}