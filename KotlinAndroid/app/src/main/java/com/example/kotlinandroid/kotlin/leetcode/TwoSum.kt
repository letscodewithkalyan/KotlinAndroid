package com.example.kotlinandroid.kotlin.leetcode

//https://leetcode.com/problems/two-sum/description/
//
fun  main(){
    var num = finTwoSumPosition_Method2(intArrayOf(2,4,6,8), 14)
    println(num)
}
fun findTwoSumPosition(array: IntArray, sum: Int): Pair<Int?, Int?> {
    val hashMap = HashMap<Int,Int>()
    for((index,num) in array.withIndex()){
        hashMap[num] = index
    }
    for ((index,num) in array.withIndex()){
        var diff = sum - num;
        if(hashMap.containsKey(diff))
        {
            return index to hashMap[diff]
        }
    }
   return null  to null
}


fun finTwoSumPosition_Method2(array: IntArray, sum: Int): Pair<Int?, Int?>{
    val  hashMap = HashMap<Int, Int>()
    for ((index,num) in array.withIndex()){
        var diff = sum - num;
        if(hashMap.containsKey(diff))
        {
            return index to hashMap[diff]
        }
        hashMap[num] = index
    }
    return null to null
}