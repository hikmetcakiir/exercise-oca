package com.hikmetcakir.practice6;

import java.util.Arrays;

import static java.util.Arrays.*;

public class A {

    public A(int a) {

        System.out.println("A's constructor");
    }

    static {
        System.out.println("A's static initializers");
    }
    public static int a(){return 2;}
    public static void main(String[] args) {
//        this();
//        this(2);
        a(new int[]{2, 3, 4, 5});

        z:
        System.out.println("123");

        int x = 5;
        KK: x = 4;


    }

    public static void a(int... args) {
        System.out.println(Arrays.toString(args));
    }
}
