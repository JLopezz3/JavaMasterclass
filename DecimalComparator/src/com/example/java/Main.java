package com.example.java;

public class Main {

    public static void main(String[] args) {
        boolean response = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        boolean response1 = DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176);
        boolean response2 = DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
        boolean response3 = DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);
    }
}
