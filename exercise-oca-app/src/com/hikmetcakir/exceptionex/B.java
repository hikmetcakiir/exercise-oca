package com.hikmetcakir.exceptionex;

public class B extends A{
    public void A() throws RuntimeException {
        System.out.println("B's A method");
    }

    public void B() throws Exception{
        System.out.println("B's B method");
    }

    public static void main(String[] args) {
        B b = new B();
        b.A();
    }
}
