package com.aydinkaya.kotlintutorials.standard_programming

fun main (){

    val age = 24
    val name = "Aydın"

    if(age >= 18){
        println("You are an adult")
    }else{
        println("You aren't an adult")
    }

    if(name == "Aydın"){
        println("Hello $name")
    }else{
        println("Yo lost name")
    }

    val userName = "admin"
    val password = 14562

    if (userName == "admin" && password == 14562) {

        println("Welcome $userName")

    }else{
        println("ıncorrect Entry")
    }

    val number = 11

    if (number == 11 || number ==12 ) {

        println("11 or 12")

    }else{
        println("not number 11 or 12")
    }

    when(number){
        1-> println("Number : 1")
        2-> println("Number : 2")
        3-> println("Number : 3")
        4-> println("Number : 4")
        else-> println("Not valid number")
    }

}