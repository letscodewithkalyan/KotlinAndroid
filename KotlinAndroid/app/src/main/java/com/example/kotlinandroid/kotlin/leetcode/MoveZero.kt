package com.example.kotlinandroid.kotlin.leetcode
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//https://leetcode.com/problems/move-zeroes/description/

fun main(){
    val intArray = intArrayOf(1,0,4,2,0,10,0,88)
    moveZeros(intArray)
    println(intArray.joinToString(" , "))
}

fun moveZeros(nums: IntArray){
    var nonZeroIndex = 0

    //Moving all non zero elements to first
    for(index in nums.indices){
        if(nums[index] != 0){
            nums[nonZeroIndex] = nums[index]
            nonZeroIndex++
        }
    }
    // Fill the last with zeros
    for(i in nonZeroIndex until nums.size){
        nums[i] = 0
    }
}