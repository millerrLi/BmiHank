package com.millerr.bmi.vending

//在一個類別中，沒有去繼承其它類別的話，預設一定會繼承java.lang.Object
//在Kotlin中，如果沒有繼承其它類別的話，是預設繼承Kotlin.Any
//覆寫方法：快速鍵：Ctrl + O
//最後改為data class
data class Drink(val name: String, val suger: Int, val price: Int) {
//    override fun toString(): String {
//        return "$name, $suger, $price"
//    }
}