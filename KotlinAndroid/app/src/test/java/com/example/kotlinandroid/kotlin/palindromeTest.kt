package com.example.kotlinandroid.kotlin

import org.junit.After
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class palindromeTest {

    lateinit var SUT: palindrome
    @Before
    fun setUp(){
        SUT = palindrome()
    }

    @After
    fun tearDown(){
    }

    @Test
    fun isPalindrome_inputString_level_expectedTrue() {
        //Arrange
        val palindrome = palindrome()

        //Act
        val result = palindrome.isPalindrome("level")

        //Assert
        Assert.assertEquals(result, true);
    }

    @Test
    fun isPalindrome_inputString_Teste_expectedFalse()
    {
        //Arrange
        val palindrome = palindrome()

        //Act
        val result = palindrome.isPalindrome("test")

        //Assert
        Assert.assertEquals(result, false)
    }
}