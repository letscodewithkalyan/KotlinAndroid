package com.example.kotlinandroid.kotlin

fun factorial(n:Int) : Int{
  if(n == 0){
      return 1;
  }
    return  n* factorial(n-1);
}

fun main(){
    println(factorial(5));
}