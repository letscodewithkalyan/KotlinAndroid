package com.example.kotlinandroid.kotlin
import kotlin.reflect.KProperty

interface Engine{
    fun runsOn()
    fun getTransmissionType()
}

class ElectricEngine: Engine {
    override fun runsOn() {
       println("Runs on Electricity")
    }

    override fun getTransmissionType() {
        println("No Manual Transmission")
    }
}

open class TeslaEngine(val engine: Engine) : Engine by engine{
    override fun getTransmissionType() {
        println("Not applicable")
    }
}

fun mainOld(){
    val sampleEngine = TeslaEngine(ElectricEngine())
    sampleEngine.runsOn()
    sampleEngine.getTransmissionType()
}

val lazyValue: String by lazy {
    println("computed!")
    "Hello"
}

class Example {
    var p: String by MyDelegate()
}
class MyDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "thank you for delegating '${property.name}' to me!"
    }
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}'")
    }
}

fun main(){
    val example = Example()
    Example().p = "Kalyan";
    println(example.p)
}