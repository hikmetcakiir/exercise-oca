package com.hikmetcakir.practice;

public class B {


    {
        System.out.println("B's instance initializer clause");
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        B b = new B();
        b.a();
    }

    public void a() {
        String s = this.toString();
        System.out.println("s= " + s);
    }
    static {

        System.out.println("B's static initializer clause");
    }
}
