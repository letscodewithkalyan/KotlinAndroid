package com.example.kotlinandroid.kotlin.interview

import com.example.kotlinandroid.kotlin.palindrome

fun main(){
    println(maxTrainTracks(intArrayOf(900, 940, 950, 1100, 1500, 1800), intArrayOf(910, 1120, 1130, 1200, 1900, 2000)))
}

fun maxTrainTracks(arrivalTime: IntArray, departurTime: IntArray)
{
    arrivalTime.sort()
    departurTime.sort()
    var aPosition = 0
    var dPosition = 0
    var maxtracks = 1
    var tracksneeded = 0

    while (aPosition < arrivalTime.count() && dPosition < departurTime.count())
    {
        if(departurTime[dPosition] >= arrivalTime[aPosition]) {
            aPosition++
            tracksneeded++
        }else{
            tracksneeded--
            dPosition++
        }
        if(maxtracks < tracksneeded){
            maxtracks = tracksneeded
        }
    }
    println(maxtracks)
}