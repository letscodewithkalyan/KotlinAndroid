package com.example.kotlinandroid.kotlin.concepts

class person(var firstName: String, secondName: String){
    //no var or val in secondary constructor
    constructor(firstName: String, age: Int): this("", ""){
        var firstNameLength = firstName.length
        //var secondNameLength = secondName.length //Error
    }

    constructor(age: Int): this("",age){
    }

    init {
        println("${firstName} ${secondName}");
    }
}

fun main(){
 println("main")
}