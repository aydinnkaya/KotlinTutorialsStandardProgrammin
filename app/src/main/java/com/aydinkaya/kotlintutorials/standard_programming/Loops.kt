package com.aydinkaya.kotlintutorials.standard_programming

fun main (){

    for(x in 1..3) { // Swift 3 point
        println("Loops 1 : $x")
    }

    for(x in 10..20 step 5) {// step ->
        println("Loops 2 : $x")
    }
    for(x in 30 downTo 20 step 5) {// step ->
        println("Loops 2 : $x")
    }

    var counter = 1
    while (counter<4){
        println("Loop 4 : $counter")
        counter++
    }



}