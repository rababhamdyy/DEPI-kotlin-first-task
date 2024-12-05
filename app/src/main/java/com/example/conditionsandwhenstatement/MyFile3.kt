package com.example.conditionsandwhenstatement

fun main(){

    /* Assignment 3: When Statement
    1.	Day of the Week:
    Write a Kotlin program that takes an integer input (1-7) representing the day of the week and
    prints the corresponding day name using a when statement. */

    println("Enter the day's order (from 1 to 7)")
    val dayInput = readLine()
    if (dayInput.isNullOrEmpty()){
        println("Input is null or empty")
    } else {
        when(dayInput.toInt()){
            1 -> println("Saturday")
            2 -> println("Sunday")
            3 -> println("Monday")
            4 -> println("Tuesday")
            5 -> println("Wednesday")
            6 -> println("Thursday")
            7 -> println("Friday")
            else -> println("Not in range (from 1 to 7)")
        }
    }

    /* 2.	Traffic Light System:
    Create a program that simulates a traffic light. It should take a string input
    ("red", "yellow", "green") and print what the driver should do ("stop", "wait", "go") using a when statement. */

    println("\nWhat's traffic light color ?")
    val lightInput = readLine()
    if (lightInput.isNullOrEmpty()){
        println("Entry is null or empty")
    } else {
        when(lightInput.lowercase()){
            "red" -> println("stop !")
            "yellow" -> println("wait !")
            "green" -> println("go")
            else -> println("It's not a traffic light !")
        }
    }

}