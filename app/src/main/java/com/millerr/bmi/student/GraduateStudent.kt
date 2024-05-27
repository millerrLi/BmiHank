package com.millerr.bmi.student

//筆記：Modifier
//public, protected, private, internal：只限定模組內可以使用
class GraduateStudent(
    id: String, name: String,
    englishScope: Int, mathScope: Int, val thesis: Int
) :
    Student(id, name, englishScope, mathScope) {

    override fun print() {
        val mark = if (average() < pass) "*" else " "
        println("$id\t$name\t$englishScore\t$mathScore\t${average()} $mark\t${grading()}\t$thesis")
    }
}

fun main() {
    val gstu = GraduateStudent("008", "Emma", 90, 80, 85)
    gstu.print()
}