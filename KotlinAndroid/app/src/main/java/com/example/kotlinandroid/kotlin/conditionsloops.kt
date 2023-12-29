package com.example.kotlinandroid.kotlin

import java.util.Scanner

fun main() {
    //greaterNumber()
    whenCondition()
}

fun greaterNumber(){
    println("Enter numbers")
    val input = Scanner(System.`in`)
    val a = input.nextInt()
    val b = input.nextInt()
    val max = if(a > b) a else b
    println("Maximum Number $max" )
}

fun whenCondition(){
    println("Enter Number")
    val input = Scanner(System.`in`)
    var num = input.nextInt()
    when(num){
        in 1..10 -> println("Inside Range of 1 to 10")
        !in 20..30 -> println("Outside Range of 20 to 30")
        else -> println("Not in range")
    }
}