package com.example.androidmaster

fun main(){
    val weekDays = arrayOf("Monday", "Tuesday", "Wesdnesday", "Thuersday")



    //println(weekDays[3])
    // Bucles for array
    for (position in weekDays.indices){
        //println(weekDays[position])
    }

    for ((position, value ) in weekDays.withIndex()){
        println("Esta position $position, contiene $value")
    }
    for (weekDay in weekDays){
        println("Ahora es $weekDay")
    }

}