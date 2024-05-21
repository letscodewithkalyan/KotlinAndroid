package com.example.kotlinandroid.kotlin

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.async
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import kotlin.coroutines.cancellation.CancellationException
import kotlin.system.measureTimeMillis

//Coroutines are concurrent design pattern the helps in android to run long running tasks asynchronously
//Light weight threads,
class Coroutines {

}

suspend fun doCoroutineWork(){
 var job = GlobalScope.launch{
    delay(10000)
 }
}

fun main1() = runBlocking {
    launch {
        delay(1000)
        println("hello")
    }
    println("world")
}

//Composing Suspending functions
suspend fun doSomethingFirst(): Int{
    println("First Start")
    delay(1000)
    return 13
}
suspend fun doSomethingSecond(): Int{
    println("Second Start")
    delay(2000)
    return 23;
}
fun main2() = runBlocking {
    val time = measureTimeMillis {
      val a = async { doSomethingFirst()  }
      val b = async { doSomethingSecond() }
        delay(200)
        println("After delay")
        a.start()
        b.start()
        println("The answer is ${a.await() + b.await()}")
    }
    println("completed time $time ms")
}

//Cancellable Suspending functions
fun main() = runBlocking {
    val cJob = launch {
        try{
        repeat(10){ i ->
            println("job: I am sleeping $i....")
            delay(500)
        }
        }finally {
            withContext(NonCancellable) {
                println("Cancellable")
                delay(1500)
                println("Cancel after delay")
            }
        }
    }
    delay(1500)
    cJob.cancelAndJoin()
    println("Completed")
}