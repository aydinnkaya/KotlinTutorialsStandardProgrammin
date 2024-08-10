package com.aydinkaya.kotlintutorials.functions

fun main() {
    // Nullable , null Safety , optional(swift)

    // definition

    var message:String? = null

     message = "hello"

    // Method
   // println("Method 1 : ${message?.uppercase()}")

    // Method  2
   // println("Method 2 : ${message!!.uppercase()}")

    // Method 3

    if(message != null){
        println("Method 3 : ${message!!.uppercase()}")
    }else{
        println("Conclusion is null")
    }


    // Method 4

    message?.let {
        println("Method 4: ${it.uppercase()}")
    }


}