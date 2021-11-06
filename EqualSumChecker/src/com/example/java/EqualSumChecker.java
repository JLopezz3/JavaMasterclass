package com.example.java;

public class EqualSumChecker {

    public static boolean hasEqualSum(int a, int b, int c){
        if(a + b == c){
            System.out.println("This is true!");
            return true;
        } else {
            System.out.println("INVALID!");
            return false;
        }
    }

}
