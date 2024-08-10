package com.aydinkaya.kotlintutorials.functions

class Functions {

    var message:String? = null
    lateinit var writing:String   //I will describe later not null
    // Void
   fun greet1(){
       val conclusion = "Hello Aydın"
       println(conclusion)
   }

    // Return
    fun greet2() : String{
        val conclusion = "Hello Aydın"
        return conclusion
    }
    fun greet3(name: String): String {
        return name
    }


    //********** Overloading : Same function different parameter **********
    fun multiplication(number1:Int, number2:Int){
        println("Multiplication: ${number1*number2}")
    }

    fun multiplication(number1:Double, number2:Int){
        println("Multiplication: ${number1*number2}")
    }

    fun multiplication(number1:Int, number2:Int, name : String){
        println("Multiplication: ${number1*number2}, Name : $name")
    }



}