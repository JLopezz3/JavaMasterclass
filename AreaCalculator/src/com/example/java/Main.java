package com.example.java;

public class Main {

    public static void main(String[] args) {

        double response = AreaCalculator.area(5.0);
        System.out.println("Area of this circle is " + response);

        double response2 = AreaCalculator.area(-1);
        System.out.println("Area of this circle is " + response2);

        double response3 = AreaCalculator.area(5.0, 4.0);
        System.out.println("Area of this rectangle is " + response3);

        double response4 = AreaCalculator.area(-1.0, 4.0);
        System.out.println("Area of this rectangle is " + response4);



    }
}
