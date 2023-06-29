package com.example.androidmaster

fun main(){
    mutableList()
}

fun mutableList(){
    val weekDays:MutableList<String> = mutableListOf("Monday", "Tuesday", "Wesdnesday", "Thuersday")
    println(weekDays)
    weekDays.add(0,"Maikol")
    println(weekDays)

    if (weekDays.isEmpty()){
        //No empty
    } else {
        weekDays.forEach{ println(it) }
    }
    if (weekDays.isNotEmpty()){
        weekDays.forEach{ println(it) }
    }
    weekDays.last()
}


 fun InmutableList() {
    val readOnly: List<String> = listOf("Monday", "Tuesday", "Wesdnesday", "Thuersday")

     println(readOnly.last())
     println(readOnly.first())
     println(readOnly.size)

     // filter
     val example = readOnly.filter { it.contains("M") }
     println(example)

     readOnly.forEach{
         println(it)
     }
}