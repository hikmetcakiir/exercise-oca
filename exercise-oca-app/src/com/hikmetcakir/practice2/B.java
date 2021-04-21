package com.hikmetcakir.practice2;

public class B extends A{

    public void A() {
        System.out.println("B's A");
    }

    public static void main(String[] args) {
        new B().A();
    }

    public static int two() {
        return 2;
    }


}
