package com.example.java;

public class MinutesToYearsAndDays {

    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        } else {
            long hours = minutes/60;
            long day = hours/24;
            long years = day/365;
            long remainingDays = day % 365;
            System.out.println(minutes +" min = "+ years+" y and "+remainingDays +" d");
        }
    }

}
