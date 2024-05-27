package com.millerr.bmi.student

class FinanceReport : Report {
    override fun load() {
        println("Load Finance report...")
    }

    override fun print(title: String) {
        println("Printing Finance report...")
    }
}