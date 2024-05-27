package com.millerr.bmi.vending

import java.net.URL

fun main() {
    //https://jsonserve.com/  後端可以協助產製JSON的工具，讓程式可以讀取，像下一行一樣
    //json資料的範例，可以透過搜尋引擎找：json example，然後貼上上面的網址，產出下列的JSON
    //https://api.jsonserve.com/AXh1oX
    val text = URL("https://api.jsonserve.com/AXh1oX").readText()
    println(text)
    val input = URL("https://api.jsonserve.com/AXh1oX").openStream()
    val reader = input.bufferedReader()
    var line = reader.readLine()
    while (line != null){
        println(line)
        line = reader.readLine()
    }
}