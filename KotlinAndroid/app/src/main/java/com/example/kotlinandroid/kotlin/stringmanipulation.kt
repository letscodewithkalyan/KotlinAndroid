package com.example.kotlinandroid.kotlin

fun main(){
    println(palindrome().reverseStringWithoutSpecialCharters("ab@c#d&"))
    println(palindrome().reverseString("kalyan"))
    println(palindrome().isPalindrome("kalyan"))
    println(palindrome().maxTrainTracks(intArrayOf(900, 940, 950, 1100, 1500, 1800), intArrayOf(910, 1120, 1130, 1200, 1900, 2000)))
}
class palindrome {
    fun isPalindrome(str: String): Boolean{
        var start = 0
        var end = str.length - 1
        while (start < end){
            if(str[start] != str[end]){
                return false
            }
            start ++
            end --
        }
        return true;
    }

    fun reverseString(str: String): CharArray{
        var charArray = str.toCharArray()
        var start = 0
        var end = str.length - 1
        while (start<end){
            var temp = charArray[start]
            charArray[start] = charArray[end]
            charArray[end] = temp
            start ++
            end --
        }
        return charArray
    }

    //Reverse only letters leave out all special characters
    fun reverseStringWithoutSpecialCharters(str: String): CharArray{
        var charArray = str.toCharArray()
        var start = 0
        var end = str.length - 1
        while (start < end){
            if(!charArray[start].isLetter()){
                start++
                continue
            }
            if(!charArray[end].isLetter()){
                end--
                continue
            }
            var temp = charArray[start]
            charArray[start] = charArray[end]
            charArray[end] = temp
            start ++
            end --
        }
        return  charArray
    }

    fun maxTrainTracks(arrivalTime:IntArray, departureTime: IntArray): Int{
        arrivalTime.sort()
        departureTime.sort()

        var plaformsNeeded = 1
        var maxPlatforms = 1
        var arrivalPosition = 1
        var departurePosition = 0
        while (arrivalPosition < arrivalTime.size && departurePosition < departureTime.size){
            if(arrivalTime[arrivalPosition] <= departureTime[departurePosition]){
                plaformsNeeded++
                arrivalPosition++
            }else{
                plaformsNeeded--
                departurePosition++
            }
            if(maxPlatforms < plaformsNeeded){
                maxPlatforms = plaformsNeeded
            }
        }
        return maxPlatforms
    }
}