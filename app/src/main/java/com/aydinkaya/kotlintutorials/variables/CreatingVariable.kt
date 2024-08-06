package com.aydinkaya.kotlintutorials.variables

fun main(){ // main ->  first started running

    println("Hello World")

    val productName = "Macbook Pro"
    val price = 3000
    val length = 1.82
    var char = 'A'
    var control = false

    println("Product Name : $productName") // $ == \() -> SwiftUI
    println("Price Info   : ${price*2}$ ")
    println("Length Info  : $length")
    println("Char         : $char")
    println("Checked      : $control")
    // val == -> let


    // Type Casting
    // Digital to digital
    val i = 42
    val d = 83.78

    val conclusion1 = i.toDouble()
    val conclusion2 = d.toInt()

    println(conclusion1)
    println(conclusion2)

    // Digital -> String

    val conclusion3 = i.toString()
    val conclusion4 = d.toString()

    println(conclusion3)
    println(conclusion4)

    // String to Int

     val  string1 = "78t"

    val conclusion5 = string1.toIntOrNull()

    if (conclusion5 != null ){
        println(conclusion5)

    }
     else {
         println("Wrong Type Casting ")
    }

    conclusion5?.let { x->
        println(x)
    }

}

