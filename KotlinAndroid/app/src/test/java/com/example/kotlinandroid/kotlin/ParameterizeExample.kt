package com.example.kotlinandroid.kotlin

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class ParameterizeExample(val input: String, val expectedResult:Boolean) {
    @Test
    fun palindrome_test(){
        //Arrange
        var SUT = palindrome();

        //Act
        val result = SUT.isPalindrome(input);

        //Assert
        Assert.assertEquals(result, expectedResult)
    }

    companion object{
        @JvmStatic
        @Parameterized.Parameters(name = "{index} : {0} is palindrome - {1}")
        fun data():List<Array<Any>>{
            return listOf(arrayOf("hello", false),
                arrayOf("level", true),
                arrayOf("a", true),
                arrayOf("", true)
            )
        }
    }
}