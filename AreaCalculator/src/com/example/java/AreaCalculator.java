package com.example.java;

public class AreaCalculator {

    public static double area(double radius){
        if(radius < 0){
            System.out.println("This is a negative, try again");
            return -1.0;
        } else {
            // area of a circle
            System.out.println("Radius is " + radius);
            return radius * radius * Math.PI;
        }
    }

    public static double area(double x, double y){
        if((x<0) || (y<0)){
            System.out.println("This is a negative, try again");
            return -1.0;
        } else {
            // area of a rectangle
            System.out.println("Parameter is " + x * y);
            return x * y;
        }
    }

}
