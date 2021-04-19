package com.hikmetcakir.hidingmethod;

import java.io.IOException;

public class B extends A {

    public static void A() throws IOException {
        System.out.println("B's static A method");
    }

    public static void B() throws RuntimeException {
        System.out.println("B's static B method");
    }

    public static void main(String[] args) throws Exception {
        B b = new B();
        b.A();

        A a = new A();
        a.A();
    }
}
