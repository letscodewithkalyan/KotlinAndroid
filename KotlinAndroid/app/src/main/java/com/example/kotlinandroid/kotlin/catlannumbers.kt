package com.example.kotlinandroid.kotlin

class catlannumbers {
}

fun main(){
    for(i in 0..10) {
        println(getCatlanNumber(i))
    }
}

fun getCatlanNumber(number: Int) : Int{
    var catLan = IntArray(number + 1){1}

    for (i in 2..number){
        catLan[i] = 0
        for (j in 0 until i){
            catLan[i] += catLan[j] * catLan[i-j-1]
        }
    }
    return catLan[number]
}