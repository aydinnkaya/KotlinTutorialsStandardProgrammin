package com.aydinkaya.kotlintutorials.object_oriented

fun main() {
   feeCalculation(CannedSize.Small, 33)
}

fun feeCalculation(size:CannedSize, piece: Int){
    when(size){
        CannedSize.Small -> println(": ${piece*130}")
        CannedSize.Middle -> println("")
        CannedSize.Large -> println("")

    }
}