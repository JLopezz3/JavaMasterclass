package com.example.java;

public class Main {

    public static void main(String[] args) {

        byte byteValue = (byte) 10;
        short shortValue = (short) 20;
        int intValue = 50;
        long myLong = (50000L + 10L*(byteValue+shortValue+intValue) );
        System.out.println(myLong);

        short shortTotal = (short)(1000 + 10 *
                (byteValue + shortValue + intValue));

    }
}
