package com.millerr.bmi

class Hello {

}

//筆記：val設定值後不可以改變，不可以再次assign
//筆記：var設定值後可以再次改變，可以再次assign
//筆記：快捷鍵：Alt + Shift + 方向鍵上下，可以讓該行的程式碼向上或向下
//筆計：快捷鍵：Ctrl + D：複製該行的程式碼, Ctrl + Y：刪除該行的程式碼
//筆記：快捷鍵：Ctrl + P：顯示物件，方法要輸入的參數提醒
fun main() {
    val p = Person("Li", 88.2f, 1.7f)
    println("Person的BMI: ${p.bmi()}")
    val millerr = Person("millerr", 78f, 1.82f)
    println("${p.name}的BMI：${p.bmi()}")
    println("${millerr.name}的BMI：${millerr.bmi()}")
    p.hello()

    //BMI
    val w = 86.6f
    val h = 1.71f
    val bmi = w / (h * h)
    println("BMI: ${bmi}")

/*
    //Byte, Short, Int, Long
    //不管是多大多小的數值，都建議用Int，不用因為數值小，就用short, Byte來表示
    //這樣會造成後續人的不便
    //如果真是要放極大的值，除了在變數後面 : 型態，也可以直接在數值後面L，代表用Long
    val age: Int = 20
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
    println(c)*/


}