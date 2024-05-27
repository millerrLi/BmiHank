package com.millerr.bmi

fun main() {
    //筆記：Set 集合：不重覆資料，沒有順序，也沒有排序
    val set = setOf<Int>(5,3,9,3,2,1,9)
    println(set)
    set.forEach { print("$it,   ") }
    set.forEach { num ->
        print("$num,  ")
    }
    //上述2種forEach都可以拜訪裡面的元素，it是不命名元素下使用
    println()
    //筆記：List特性1：有索引值 index
    //筆記：List特性2：元素內容可以重覆
    //筆記：List特性3：元素有順序性
    val list = listOf<Int>(5,3,8,5,3,2,1)
    println(list)
    // C, D, H, S
    val deck = mutableListOf<Int>()
    var quotient = 0
    var remainder = 0
    for (i in 0 until 52) {
        deck.add(i)
        quotient = i / 13
        remainder = i % 13
        if (remainder == 0 && i != 0) println()
        //when的語法
        var type = when (quotient) {
            0 -> "♣"
            1 -> "♢"
            2 -> "♡"
            else -> "♠"
        }
        if (quotient == 3 && remainder == 0) print("\uD83C\uDCA1 ")
        else print("${(remainder) + 1}$type ")
        /*                var type = if (i / 13 == 0) "C"
                        else if (i / 13 == 1) "D"
                        else if (i / 13 == 2) "H"
                        else "S"*/
    }
    println()
    println(deck)
    val deck2 = deck.shuffled()
    println(deck)
    println(deck2)
    val a = deck.shuffled().first()
    val b = deck.shuffled().first()
    //筆記：a 和 b 可能是一樣的
    println("a是$a, b是$b")
}