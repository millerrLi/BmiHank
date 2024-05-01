package com.millerr.bmi

fun main() {
    //小技巧，kotlin在選取方法時，用enter鍵會把所選的方法帶進來，原本的程式會往後擠，而用tab鍵時，則是原先後面相似的程式碼取代掉
    //LIST，跟陣列很像，也不能改變大小和變更裡面的東西
    //mutableListOf，陣列可加大縮小及變換裡面的內容
    //取亂數，在mutableListOf, 用shuffle()，可以原本裡面的資料打亂，再取第0個位置的值出來就可以了。
    val nums = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    nums.shuffle()
    val secret = nums.removeAt(0)
    val bomb = nums.removeAt(0)
    println("秘密數字：${secret}")
    println("地雷數字：${bomb}")
    println(nums)

    //======================
    val list = listOf<Int>(2, 5, 8)
    println(list)
    val list2 = mutableListOf<Int>(2,5,8)
    list2.add(13)
    println("mutableList, ${list2}")
    list2.removeAt(2)
    println("removeAt ${list2}")

    //array
    val array = intArrayOf(2, 5, 8)
    println(array)
    for (num in array){
        print("${num}, ")
    }
    println("陣列長度：${array.size}")
    println("陣列中的元素值：${array[1]}")

    val ss = arrayOf("SUM", "MON", "TUE", "WEN", "THU", "FRI", "SAT")
    println("星期陣列長度：${ss.size}")
    println("星期幾呢？${ss.get(2)}")
    for (day in ss){
        print("$day; ")
    }
    //For  0..10
    val range = 0..10
    for (i in 1..30){
        if(i%2 == 1){
            print("*")
        }else{
            print(" ")
        }
    }
    println()
    for (i in 1..10 step 2) print(i)
    println()

    var name:String? = null
    var name2:String?= null
    println("姓名長度：${name?.length}")
    //筆記：宣告姓名String, 如果?=  代表name可以為null
    //筆記：加 ? 代表，name不是null的時候，才做name.length
    //筆記：這時候因為可以為null，在用.length或.get等屬性時，就要有針對null的處理，在變數的後面也加?
    //筆記：代表如果這時候變數真的為null時，就直接印出null
    println("取得某一字：${name?.get(1)}")
    //筆記：如果在println時不想加null，也可以用Android studio提供的解決方法，Alt + Enter
    if (name2 != null) {
        println("不要加?的寫法${name2.length}")
    }
    //貓王符號：  ?=    代表如果變數或物值不為null，則帶入其變數或物件值，如果是null的話，則帶入右邊給的值
    println("貓王符號Elvis operator：${    name2 ?: 0   }")

    var counter = 0
    counter = counter + 1
    counter++
    counter = counter - 1
    println(counter)
    println(10 / 3)
    println(10 / 3.0)
    //Boolean
    var b = true
    var a = false
    println(!b)
    println(a && b)
    println(a || b)
    //小於等於大於
    val num = -8
    println("數值比較：${num <= 5 && num >= -3}")
    println("數值比較2：${num > 5}")
    println("數值比較3：${num < -3 || num > 5}")
}