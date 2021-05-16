package com.hikmetcakir.practice11;

public class B extends A {
    private void methodPrivate() {
        System.out.println("B's private method");
    }

    public static void main(String[] args) {
        B b = new B();
        A a = new A();
//        b = (B)a;
        a = b;
        B bc = (B)a;
        bc.methodPrivate();
    }
}
