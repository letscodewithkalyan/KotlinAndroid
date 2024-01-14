package com.example.kotlinandroid.kotlin

class catlannumbers {
}

fun main(){
    for(i in 0..10) {
        println(getCatLanNumber(i))
    }
}

//fun getCatlanNumber(number: Int) : Int{
//    var catLan = IntArray(number + 1){1}
//
//    for (i in 2..number){
//        catLan[i] = 0
//        for (j in 0 until i){
//            catLan[i] += catLan[j] * catLan[i-j-1]
//        }
//    }
//    return catLan[number]
//}

fun getCatLanNumber(num:Int) : Int{
    var catlannumbers = IntArray(num + 1)
    if(num == 0 ||num == 1){
        return  1
    }
    catlannumbers[0] = 1
    catlannumbers[1] = 1
    for(i in 2..num){
        catlannumbers[i] = 0
        for(j in 0 until i){
            catlannumbers[i] += catlannumbers[j] * catlannumbers[i-j-1]
        }
    }
    return catlannumbers[num]
}