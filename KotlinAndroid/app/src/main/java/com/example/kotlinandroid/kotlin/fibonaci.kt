package com.example.kotlinandroid.kotlin

fun main(){
    var t0: Int = 0
    var t1: Int = 1
    for (i in 0..10){
        println(t0)
        val sum = t0 + t1
        t0 = t1
        t1 = sum
    }
}

