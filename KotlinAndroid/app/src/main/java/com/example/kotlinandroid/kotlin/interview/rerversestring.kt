package com.example.kotlinandroid.kotlin.interview

import com.example.kotlinandroid.kotlin.reverseNumber

fun main() {
    println(reverseString("kalyan"))
    println(reverseWithoutSpecialCharacters("my@str@in#g"))
    println(reverseNumber(23456))
    println(isPalindrome("mdm"))
}

//Loblaw
fun reverseWithoutSpecialCharacters(str: String) : CharArray {
    val chaSet = str.toCharArray()
    var first = 0
    var last = chaSet.count() - 1
    while (first<last){
        if(!chaSet[first].isLetter()){
            first++
        }
        if(!chaSet[last].isLetter()){
            last--
        }
        var swapChar = chaSet[first]
        chaSet[first] = chaSet[last]
        chaSet[last] = swapChar
        first++
        last--
    }
    return chaSet
}

fun reverseString(str: String): CharArray {
    val charSet = str.toCharArray()
    var first = 0
    var last = charSet.count() - 1
    while (first < last) {
        var char = charSet[last]
        charSet[last] = charSet[first]
        charSet[first] = char
        first++
        last--
    }
    return charSet
}

fun reverseNum(number: Int):  Int{
    var exactNum = number
    var reverseNum = 0
    while (exactNum>=0){
        var quotient = exactNum % 10
        reverseNum = reverseNum * 10 + quotient
        exactNum = exactNum / 10
    }
    return reverseNum
}

fun isPalindrome(str: String): Boolean {
    val charSet = str.toCharArray()
    var first = 0
    var last = charSet.count() - 1
    while (first < last) {
        if (charSet[first] != charSet[last]) {
            return false
        }
        first++
        last--
    }
    return true
}