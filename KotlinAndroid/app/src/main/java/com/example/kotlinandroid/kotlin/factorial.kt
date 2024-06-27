package com.example.kotlinandroid.kotlin

fun factorial(n: Int): Int {
    if (n == 0) {
        return 1;
    }
    return n * factorial(n - 1);
}

fun main() {
    println(factorial(5));
    println(reverseNumber(5348))
    println(reverseString("Kalyan"))
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

fun reverseString(name: String): CharArray{
    var charArray = name.toCharArray()
    var start = 0;
    var end = charArray.count() - 1
    while (start < end){
        val rem = charArray[start]
        charArray[start] = charArray[end]
        charArray[end] = rem
        start++
        end--
    }
    return charArray
}