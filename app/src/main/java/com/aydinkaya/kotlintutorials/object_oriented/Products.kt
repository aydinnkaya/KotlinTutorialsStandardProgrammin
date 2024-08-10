package com.aydinkaya.kotlintutorials.object_oriented

data class Products (var id : Int, var name:String,var price:Int){

    init { // Constructor

        //The init class is run when an object of this class is created.

        println("Created Object")

    }

    fun getInformation(){

        println("----------------")
        println("Id: ${this.id}")
        println("Name: ${this.name}")
        println("Price: ${this.price}")
    }

    // this  : Object of the class it is in.
    // super : Represents the inherited superclass
}