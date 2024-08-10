package com.aydinkaya.kotlintutorials.object_oriented

fun main() {
    val product1 = Products(1,"TV",9999)
    // value access
    product1.getInformation()
    println("----------------")

    val product2 = Products(2,"Watch",8888)
  //  product1.getInformation()
    println("Id: ${product2.id}")
    println("Name: ${product2.name}")
    println("Price: ${product2.price}")

    println("----------------")

    val product3 = Products(3,"iOS",7777)
    println(product3.name)

    product3.name = "Android"
    println(product3.name)

}