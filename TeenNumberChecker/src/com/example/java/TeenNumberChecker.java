package com.example.java;

public class TeenNumberChecker {

    public static boolean hasTeen(int a, int b, int c){
        if(((a>13) && (a<20) || (b>13) && (b<20) || (c>13) && (c<20))){
            System.out.println("THIS IS TRUE");
            return true;
        } else {
            System.out.println("THIS IS FALSE");
            return false;
        }
    }

    public static boolean isTeen(int a){
        if((a > 12) && (a < 20)){
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }

}
