package com.example.kotlinandroid.kotlin.concepts

enum class Directions(degress: Int){
    SOUTH(0){
        override fun doSomething() {}
    },
    EAST(0){
        override fun doSomething() { }
    },
    WEST(0){
        override fun doSomething() { }
    },
    NORTH(0){
        override fun doSomething() { }
    };
    abstract fun doSomething();
}

sealed class Result
class Success(data: Any) : Result(){
    fun printSuccess(){}

    var firstname: String? = null
        get() = field
        set(value) { field = value }
}
class Failure(message: String): Result(){
    fun printFailure(){}
}

fun main(){
    val b = "Kotlin";
    print(if (b != null) b.length else -1);

}

interface Direction{
}