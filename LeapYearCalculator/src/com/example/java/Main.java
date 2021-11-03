package com.example.java;

public class Main {

    public static void main(String[] args) {
        boolean response = LeapYearCalculator.isLeapYear(-1600);
        System.out.println(response);
        boolean response2 = LeapYearCalculator.isLeapYear(1600);
        System.out.println(response2);
        boolean response3 = LeapYearCalculator.isLeapYear(2017);
        System.out.println(response3);
        boolean response4 = LeapYearCalculator.isLeapYear(2000);
        System.out.println(response4);
    }
}
