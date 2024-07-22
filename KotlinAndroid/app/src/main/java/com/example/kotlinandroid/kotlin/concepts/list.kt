package com.example.kotlinandroid.kotlin.concepts

class list {
}

//fun main(){
//    var arraynames = arrayOf("joe", "kalyan", "pidugu", "kalyan")
//    var listnames = listOf("joe", "kalyan", "pidugu", "kalyan")
//    var setNames = setOf("joe","pidugu", "pidugu", "kalyan")
//    println(setNames)
//    println(listnames)
//}

fun main(){
//   var listOfNumbers = listOf(1,2,3,4,5,6,7,8)
//   println(listOfNumbers.map {  it * 2 }) // Multiply all numbers
//   println(listOfNumbers.filter { it % 2 == 0 }) //EvenNumbers
//   println(listOfNumbers.reduce { acc, i -> acc + i })
//   var alphabets = listOf("a", "b", "c")
//   println(alphabets.reduceIndexed { index, acc, i ->  acc + i + index })

   runFlat()
}

fun runFlat(){
   var listListOf = listOf(listOf("Kalyan", "Pidugu"), listOf("K", "P"), listOf("P", "K"))
   println(listListOf.flatten())
   //Reduce will not taken initial value
   //It considers first element as initial value
   println(listListOf.reduce{ acc, i -> acc + i})

   var innerList = listOf(Team("Team A", listOf("Kalyan", "Pidugu")), Team("Team B", listOf("K", "P")), Team("Team C", listOf("P", "K")))
   println(innerList.flatMap{ it.names })

   //In Fold we will provide initial value
   println(innerList.fold(listOf<String>()){list, team -> list + team.names})
}

data class Team(val name: String, val names: List<String>)


data class Person(val name: String, val age: Int)