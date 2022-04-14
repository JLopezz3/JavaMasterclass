package com.example.java;

public class StaticTest {
    private static int numInstances = 0; // have to make this static, or else it will keep printing out 1;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }

    public int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
