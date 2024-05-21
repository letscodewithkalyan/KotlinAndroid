package com.example.kotlinandroid.java;

import com.example.kotlinandroid.kotlin.KotlinDemoKt;

public class JavaDemo {

    public static void main(String args[]){
        System.out.println(KotlinDemoKt.multiplyInKoltin(5,5));
        KotlinDemoKt.returnNothing();
    }
    public int multiplyInJava(int first, int second){
        return  first * second;
    }
    public void ReturnVoid(){}
}
