package com.hikmetcakir.practice;

public class A {
    static {
        System.out.println("static clause");
    }

    {
        System.out.println("instance initializer clause");
    }

    static int b = 0;
}
