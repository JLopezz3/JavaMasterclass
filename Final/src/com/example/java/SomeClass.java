package com.example.java;

public class SomeClass {
    private static int classCounter = 0;
    public final int instanceNumber;
    public final String name; // final means value cannot be changed

    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
