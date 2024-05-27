package com.millerr.bmi.vending

import java.io.File

fun main() {
    val drinks = listOf<Drink>(
        Drink("Black tea", 0, 50),
        Drink("Green tea", 5, 45),
        Drink("Wuloon tea", 3, 60)
    )

    //printWriter，一般少量的列印輸出
    val out = File("order.txt").printWriter()
    for (d in drinks){
        out.println("${d.name},${d.suger},${d.price}")
    }
    out.flush()
    //有buffer的輸出，可以用在大檔案
    val out2 = File("order2.txt").bufferedWriter()
    for (d in drinks){
        out2.write("${d.name},${d.suger},${d.price}\n")
    }
    out2.flush()
}