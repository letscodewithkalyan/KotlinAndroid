package com.example.kotlinandroid.kotlin

import java.util.Arrays

//Sort it up problem
//An array consists only Zeros, Ones, Twos
//Sort it up without using another array

fun main(){
  val intarr = intArrayOf(0,1,0,2,1,1,1,0)
    sortItMap(intarr)
  println(Arrays.toString(intarr))
}

fun sortItMap(array: IntArray){
    var lbound = 0
    var rbound: Int = array.count() - 1
    var current: Int = 0

    while (current < rbound){
        if(array[current] == 2){
            //Move all two to last(rbound) swap
            array[rbound] = array[current].apply { array[current] = array[rbound] }
            rbound -= 1;
        }else if(array[current] == 1){
            current += 1
        }else if(array[current] == 0){
            //Move all ones to first(lbound) swap
            array[lbound] = array[current].apply { array[current] = array[lbound] }
            lbound += 1
            current += 1
        }
    }
}