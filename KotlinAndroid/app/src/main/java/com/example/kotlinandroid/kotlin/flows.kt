package com.example.kotlinandroid.kotlin

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map

var numberflow: Flow<Int> = flow {
    repeat(10){
       emit(it)
       delay(1000)
    }
}

suspend  fun main(){
   numberflow.map { it -> it * it }
       .filter { it -> it % 2 == 0 }
       .collect{ it ->
       println(it)
    }
}