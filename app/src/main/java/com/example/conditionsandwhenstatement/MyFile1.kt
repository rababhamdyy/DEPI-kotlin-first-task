package com.example.conditionsandwhenstatement

fun main(){

    /*  Assignment 1: Basic Data Types
    1.	Primitive Types:
    ● Write a Kotlin program that declares variables of different primitive types (e.g., Int, Double, Char, Boolean) and prints their values.
    ● Modify the program to perform type conversion between these primitive types and display the results */

    val x = 5
    println("x of type int = $x")

    val y = 45.2
    println("y of type double = $y")

    val z = 'r'
    println("z of type char = $z")

    val d = true
    println("d of type boolean = $d \n")

    val xToDouble = x.toDouble()
    println("x turned into double : $xToDouble")

    val  xToChar = x.toChar()
    println("x turned into char : $xToChar")

    val  yToInt = y.toInt()
    println("y turned into int : $yToInt \n")

    /*
    2.	String Manipulation:
    Write a program that takes a user's full name as input and prints the following in one print statement:
    ● The length of the name.
    ● The first character of the name.
    ● The name in uppercase and lowercase.
    ● A substring of the name from the 2nd to the 5th character. */

    println("What's your full name ? ")
    val name = readLine()

    if (name.isNullOrEmpty()){
        println("Name is null")
    } else {
        println("Length of name : (${name.length}) , First Char : (${name.getOrNull(0)}) , " +
                "Uppercase : (${name.uppercase()}) , Lowercase : (${name.lowercase()}) , From 2nd to 5th char : (${name.subSequence(1..4)}) ")
    }

}