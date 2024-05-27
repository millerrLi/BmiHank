package com.millerr.bmi.student

/**
 * 學生有學號、姓名、英文成績、數學成績
 * 印出學生資料
 * 印出學生平均成績
 * 印出學生等級(A, B, C, D, E)
 */

//筆記：open 開放類別未來能有衍生設計
open class Student(
    val id: String,
    val name: String,
    var englishScore: Int = 0,
    var mathScore: Int = 0
) {
    //次要建構子，()內的變數是次要建構子自己的，為區域變數，可以將它交回給主要建構子
    //this就是指主要建構子
//    constructor(id: String, name: String): this(id, name, 0, 0)
    companion object {
        var pass = 60
    }

    open fun print() {
        val mark = if (average() < pass) "*" else " "
        println("$id\t$name\t$englishScore\t$mathScore\t${average()} $mark\t${grading()}")
    }

    protected fun average() = (englishScore + mathScore) / 2

    fun grading() = when (average() / 10) {
        9, 10 -> "A"
        8 -> "B"
        7 -> "C"
        6 -> "D"
        else -> "F"
    }
}

fun main() {
    Student.pass = 50
    val students = listOf<Student>(
        Student("001", "Jack", 40, 60),
        Student("002", "Hank", 66, 87),
        Student("003", "Jane")
    )
    for (stu in students) {
        stu.print()
    }
//    for (i in 0..2){
//        students.get(i).print()
//    }
//    val stu1 = Student("001", "Jack", 100, 100)
//    val stu2 = Student("002", "Hank", 66, 87)
//    val stu3 = Student("003", "Jane")
//    stu1.print()
//    stu2.print()
//    stu3.print()
}

/**
 * 筆記：Companion object 陪伴、夥伴、陪同型物件(類別層級) 就是 static
 */