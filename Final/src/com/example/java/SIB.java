package com.example.java;

public class SIB {
    public static final String owner;


    //static methods called first before constructors
    static {
        owner = "tim";
        System.out.println("SIBTest static initialization block called");
    }

    public SIB(){
        System.out.println("SIB constructor called");
    }

    static {
        System.out.println("2nd initialization block called");
    }

    public void someMethod(){
        System.out.println("someMethod called");
    }
}
