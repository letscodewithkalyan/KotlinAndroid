package com.example.kotlinandroid.kotlin

//Given an integer n, write a function that returns count of trailing zeroes in n!.
//If we find n! by function and calculate the number of zeros at the end we will get stack overflow exception
//Zeros will by multiply 5 with 2 if we count number of 5s will get answer as number 2s will be more or equal to number of 5s
//https://www.geeksforgeeks.org/count-trailing-zeroes-factorial-number/

fun main(){

}

fun factorialForNumberOfZeros(n:Int) : Int{
    if(n<=0){
        return 0;
    }
    var count = 0;
    // Keep dividing n by powers
    // of 5 and update count
    var i = 5
    while (n / i >= 1) {
        count += n / i
        i *= 5
    }
    return count;
}

