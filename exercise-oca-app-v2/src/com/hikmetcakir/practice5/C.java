package com.hikmetcakir.practice5;

public class C extends B {

    private static final int b;

    private final int a;

    static {
//        a = 4;
    }

//    { a  = 3;}

    static {
        b = 4;
    }
//    { b = 5;}

    static{
        System.out.println("C's static initializer");
    }

    {
        System.out.println("C's instance initializer");
    }

    public C() {
        a = 3;
//        b = 4;
        System.out.println("C's constructor");
    }

    public static void main(String[] args) {
//        b = 3;
        C C = new C();
    }
}
