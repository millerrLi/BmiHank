package com.millerr.bmi.vending

fun Drink.off20(): Drink{
    return this.copy(price = (this.price * 0.8).toInt())
}
fun main() {
    val s= "abcdf"
    println(s.validate())
    //1、第一次在沒有覆寫Drink的toStirng, 父類別會直接回傳「com.millerr.bmi.vending.Drink@7e0ea639」回來
    //2、可以在Drink裡面去覆寫toStrnig，就能印出自己想要的
    //3、如果把Drink改為data class的話，就有一些data class特有的功能可以用，例如data class的toString
    val tea = Drink("Black tea", 0, 50)
    val tea2 = tea.copy(suger = 5)
    val discountTea = tea.off20()

    println(tea)
    println(tea2)
    println(discountTea)
    //筆記：map，一組資料，用key-value表示
    //筆記：map裡面的元素，其實是用一個Pair(1, "Coke")來表示，下列的方式比較人性
    val drinks = mutableMapOf<Int, String>(
        1 to "Coke",
        2 to "7-up",
        3 to "Coffee",
        4 to "break tea",
        5 to "milk"
    )
    println(drinks)
    println(drinks.get(3))
    drinks.put(6, "Water")
    println(drinks)

}

//extension擴充：沒有原來這個類別的程式碼，又想要擴充它，可以用這個方式
fun String.validate(): Boolean {
    return this.length >= 6
}