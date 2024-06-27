package com.example.kotlinandroid.kotlin

fun main(){
    println(factorialNum(5))
    println(findNumberOfZerosInFactorial(35))
}

fun factorialNum(input: Int): Int{
    if(input<=1){
        return  1;
    }
    return  input * factorialNum(input -1);
}

fun findNumberOfZerosInFactorial(input: Int): Int{
    //Since it is factorial if we calculate we may get stackoverflow exception
    //If we caculate number of 5 and 25 and 125
    if(input < 1){
        return  -1
    }
    var zerosCount  = 0;
    var i = 5
    while (input/i >= 1){
        zerosCount += input/i
        i *= 5
    }
    return zerosCount;
}