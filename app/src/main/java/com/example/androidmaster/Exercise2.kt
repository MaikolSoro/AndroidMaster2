package com.example.androidmaster

fun mainM() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
    // Define your displayAlertMessage() below this line.

}

fun displayAlertMessage(a: String, b: String): String {
    return "There's a new sign-in request on $a for your Google Account $b."
}

fun main() {

    val firstUserEmailId = "user_one@gmail.com"
    println(displayAlertMessage2(emailTd = firstUserEmailId))
    println()
    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"
    println(
        displayAlertMessage2(
            operatingSystem = secondUserOperatingSystem,
            emailTd = secondUserEmailId
        )
    )
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"
    println(
        displayAlertMessage2(
            operatingSystem = thirdUserOperatingSystem,
            emailTd = thirdUserEmailId
        )
    )
    println()

}

fun displayAlertMessage2(operatingSystem: String = "Unknown OS", emailTd: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailTd."
}

fun mainpaso2() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val subtract = subtract(firstNumber, thirdNumber)


    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $subtract")
}

// Define add() function below this line
fun add(a: Int, b: Int): Int {
    return a + b
}

fun subtract(a: Int, b: Int): Int {
    return a - b
}
