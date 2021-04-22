package com.hikmetcakir.package3;

public class B extends A {
    public static   int a = 2;

    public static   void a() {
        System.out.println("B's a method a variable value= " + a);
    }

    public void a2() {
        System.out.println("B's a2 method called");
    }

    public static void main(String[] args) {
        B b = new B();
        System.out.println("b.a= " + b.a);
        b.a();
        b.a2();

        System.out.println();

        A a = new A();
        System.out.println("a.a= " + a.a);
        a.a();
        a.a2();

        System.out.println();

        A ab = new B();
        System.out.println("ab.a= " + ab.a);
        ab.a();
        ab.a2();
    }
}
