package com.example.kotlinandroid.kotlin

fun distinctCombinationsLength2(intArray: Array<Int>): Set<Pair<Int,Int>>{
    var combinations = mutableSetOf<Pair<Int,Int>>()
    for (i in 0..intArray.size -1){
        for (j in i.. intArray.size -1){
            combinations.add(Pair(intArray[i], intArray[j]))
        }
    }
    return combinations;
}

fun main(){
    val array = arrayOf(1,2,3,4)
    println(distinctCombinationsLength2(array))
}