package com.example.kotlinandroid.kotlin



fun main() {
    println(factorial(5));
    println(reverseNumber(5348))
    println(fibonacci())
}

fun factorial(n: Int): Int {
    if (n == 0) {
        return 1;
    }
    return n * factorial( n - 1); // for negative numbers factorial is -1! = 1, -2! = 2, -3! = -6, -4! =24
}

fun fibonacci(){
    var t0: Int = 0
    var t1: Int = 1
    println(t0)
    println(t1)

    for (i in 0..10){
        val sum = t0 + t1
        t0 = t1
        t1 = sum
        println(sum)
    }
}


//Reverse a number
fun reverseNumber(num: Int): Int {
    var exactNum = num
    var reverseNum = 0
    while (exactNum > 0) {
        reverseNum = reverseNum * 10 + exactNum % 10
        exactNum = exactNum / 10;
    }
    return reverseNum;
}

