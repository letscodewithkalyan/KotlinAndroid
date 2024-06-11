package com.example.kotlinandroid.kotlin

fun factorial(n:Int) : Int{
  if(n == 0){
      return 1;
  }
    return  n* factorial(n-1);
}

fun main(){
    println(factorial(5));
    println(reverseNumber(5348))
}

//Reverse a number
fun reverseNumber(num:Int): Int{
    var exactNum = num
    var reverseNum = 0
    while(exactNum > 0){
        reverseNum = reverseNum * 10 + exactNum % 10
        exactNum = exactNum /10;
    }
    return reverseNum;
}