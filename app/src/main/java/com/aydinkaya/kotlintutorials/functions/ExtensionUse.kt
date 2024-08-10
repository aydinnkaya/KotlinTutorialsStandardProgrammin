package com.aydinkaya.kotlintutorials.functions

fun main() {
    val conclusion = 5 multiplication 4
    println(conclusion)
}


infix fun Int.multiplication(number: Int): Int{
    return this*number
    // This === Int
}