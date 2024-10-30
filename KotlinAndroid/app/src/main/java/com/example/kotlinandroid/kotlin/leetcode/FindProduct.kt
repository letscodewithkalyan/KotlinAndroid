package com.example.kotlinandroid.kotlin.leetcode
//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//https://leetcode.com/problems/product-of-array-except-self/description/

fun main(){
    findProduct(intArrayOf(1,2,3,4))
}
fun findProduct(array: IntArray) {
    var productArray = mutableListOf<Int>()
    var product = 1
    for (element in array) {
        product = product * element
    }
    for(element in array){
        productArray.add(product/element)
    }
    print(productArray)
}