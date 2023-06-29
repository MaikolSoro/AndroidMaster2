package com.example.androidmaster


// variables
fun main() {
   getSemester(12)
}

fun getMonth2(month: Int){
    when(month){
    1 -> println("enero")
    else -> println("No existe")
    }
}
fun getSemester(month: Int):String {
   return when(month) {
        in 1..6 ->  "Primer Semester"
        in 7..12 ->  "Segundo Semester"
        !in 1..12 ->  "Semestre no váldio"
        else ->  "dawd"
    }
}
fun gettrimester(month: Int){
    when(month) {
        1, 2, 3 -> println("Primer trimester")
        else -> println("Trismester no valido")
    }
}
fun getMonth(month:Int){
    if(month == 1){
        println("enero")
    }else if(month == 2){
        println("febrero")
    }else if(month == 3){
        println("marzo")
    }else if(month == 4){
        println("abril")
    }else if(month == 5){
        println("mayo")
    }else if(month == 6){
        println("junio")
    }else if(month == 7){
        println("july")
    } else if(month == 8){
        println("agosto")
    } else{
        print("no existe")
    }
}