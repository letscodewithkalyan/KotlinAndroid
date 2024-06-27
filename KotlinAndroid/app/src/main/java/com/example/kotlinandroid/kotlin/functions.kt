package com.example.kotlinandroid.kotlin

fun main(){
    functionLamdaTest()
    anonymousFunctions()
}

fun forloop(){
    for(i in 0..10){
        println("The Numbers are ${i}");
    }
    //Assigning function to variable
    val even = ::evenNumbers
    even()
}

fun evenNumbers(){

    val sum = {a: Int,b:Int -> a+b}
    println(sum(10,20))
    // For have variable in range/list
    for (i in 0..20){
        if (i % 2 == 0){
            println("Even Numbers are ${i}")
        }
    }
}

fun functionLamdaTest(){
    //Lamda Expression
    var printStatement: () -> Unit = {println("Print Statement")}
    var sum: (Int, Int) -> Int = {a,b -> a+b}
    var innerFunction: () -> () -> Unit = {{ println("Inner Functions") }}

    printStatement()
    println(sum(20,40))
    innerFunction()()
}

fun anonymousFunctions(){
    val print = { println("Anonymous function print") }
    val sum = {a:Int, b:Int -> a+b}
    val innerFunction = {{ println("Anonymous inner function") }}

    print()
    println(sum(40, 60))
    innerFunction()()
}