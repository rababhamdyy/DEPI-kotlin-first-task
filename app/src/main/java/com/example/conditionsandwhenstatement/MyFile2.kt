package com.example.conditionsandwhenstatement

fun main(){

    /* Assignment 2: Conditions and If Statement
    1.	Age Category:
    Write a Kotlin program that reads a person's age and prints out their life stage (child, teenager, adult, senior) based on the following criteria:
    ● 0-12: Child
    ● 13-19: Teenager
    ● 20-64: Adult
    ● 65 and above: Senior */

    println("Enter your age")
    val age = readLine()

    if (age.isNullOrEmpty()){
        println("Age is null")
    } else {
        if (age.toInt() in 0..12){
            println("You are a child")
        } else if (age.toInt() in 13 .. 19){
            println("You are a Teenager")
        } else if (age.toInt() in 20..64){
            println("You are an adult")
        } else if (age.toInt() in 65..120) {
            println("You are a senior")
        }
    }
}