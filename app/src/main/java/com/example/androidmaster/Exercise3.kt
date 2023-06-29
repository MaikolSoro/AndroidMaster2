package com.example.androidmaster

fun main1() {
    val steps = 4000
    val caloriesBurned = convertStepsToCalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories")
}

fun convertStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned  = numberOfSteps * caloriesBurnedForEachStep
    return totalCaloriesBurned
}

fun main() {
  /*
    println("City: Ankara")
    println("Low temperature: 27, High temperature: 31")
    println("Chance of rain: 82%")
    println()

    println("City: Tokyo")
    println("Low temperature: 32, High temperature: 36")
    println("Chance of rain: 10%")
    println()

    println("City: Cape Town")
    println("Low temperature: 59, High temperature: 64")
    println("Chance of rain: 2%")
    println()

    println("City: Guatemala City")
    println("Low temperature: 50, High temperature: 55")
    println("Chance of rain: 7%")
    println()


   */
    printWeatherDetails("Ankara", 27, 31, 82)
    printWeatherDetails("Tokyo", 32, 36, 10)
    printWeatherDetails("Cape Town", 59, 64, 2)
    printWeatherDetails("Guatemala City", 50, 55, 7)
}

/**
 * Hay muchas similitudes en el código que imprime el clima de cada ciudad. Por ejemplo,
 * hay frases que se repiten varias veces, como "City:" y "Low temperature:".
 * Los códigos similares y repetidos crean el riesgo de que se produzcan errores en tu programa.
 * Puede que hayas escrito mal una de las ciudades o que hayas olvidado uno de los detalles del clima.

¿Puedes crear una función que imprima los detalles del clima de una sola ciudad para reducir la repetición en la función main()
y, luego, hacer lo mismo en las ciudades restantes?
¿Puedes actualizar la función main() a fin de llamar a la función que creaste para cada ciudad
y pasar los detalles apropiados del clima como argumentos?
 * **/


fun printWeatherDetails(city:String, lowTemperature:Int, highTemperature:Int, chanceOfRain: Int){
    println("City: $city")
    println("Low temperature: $lowTemperature, High temperature: $highTemperature")
    println("Chance of rain: $chanceOfRain%")
    println()
}