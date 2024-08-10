package com.aydinkaya.kotlintutorials.functions

fun main() {

    val function = Functions()

    function.greet1()

    println("-----------")

    val theResult = function.greet2()
     println("The Result : $theResult")
    println("-----------")

    val theResult2 = function.greet3("Aydın")
    println("The Result Name : $theResult2")

    println("-----------")

    function.multiplication(10,20,"Aydın")
}