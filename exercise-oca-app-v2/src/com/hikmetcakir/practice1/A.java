package com.hikmetcakir.practice1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class A {
    private int a;
    private int b;
    private int c;
//    private static int a; // DOES NOT COMPILE
    final int c1;
    static final int a1;
    static{
        a1 = 5;
    }

    {
//        c1 = 123;
    }


    public A() {
        c1 = 123;
    }


    public void a() {

    }

    public static void A() {
    }

    public static void A(int A) {
    }

    public int A(int A, int B) {
        return 2;
    }

    public double A(int A, int B, int C) {
        return 2;
    }

    public static void main(String[] args) {
//        Integer i = Integer.parseInt("10.2"); // java.lang.NumberFormatException
//        Float f = Float.parseFloat("20.0");
//        System.out.println("f= " + f);

//        LocalDate d0 = LocalDate.parse("2015-02-05", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate d1 = LocalDate.parse("2015-02-05", DateTimeFormatter.ISO_DATE);
        LocalDate d2 = LocalDate.of(2015, 2, 5);
        LocalDate d3 = LocalDate.now();
//        System.out.println(d0);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        int c = 123;
        char b = 'a';
        char k = b++;
        System.out.println('c' + 123);

//        char b1 = "12345".charAt('a');
//        System.out.println("b1= " + b1);

//        Exception e = null;
//        throw e;

        String a = "" + null;
        System.out.println(a);
    }

    public float parseFloat(String s) {
        float f = 0.0f;
        try {
            f = Float.valueOf(s).floatValue();
            return f;
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid input " + s);
            f = Float.NaN;
            return f;
        } finally {
            System.out.println("finally");
        }

    }
}
