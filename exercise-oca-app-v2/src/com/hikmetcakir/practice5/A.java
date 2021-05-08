package com.hikmetcakir.practice5;

public class A {

    static{
        System.out.println("A's static initializer");
    }

    {
        System.out.println("A's instance initializer");
    }

    public A() {
        System.out.println("A's constructor");
    }

    public static void main(String[] args) {

    }
}
