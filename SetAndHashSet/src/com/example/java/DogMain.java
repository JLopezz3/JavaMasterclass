package com.example.java;

public class DogMain {
    public static void main(String[] args) {
        Labrador rover = new Labrador("Rover");
        Dog rover2 = new Dog("Rover");

        System.out.println(rover2.equals(rover));
        System.out.println(rover.equals(rover2));
        // Labrador is an instance of Dog, but a Dog isn't an instance of Labrador, therefore it will return TRUE, FALSE
        // now if i comment out override method in labrador, will return true true
    }
}
