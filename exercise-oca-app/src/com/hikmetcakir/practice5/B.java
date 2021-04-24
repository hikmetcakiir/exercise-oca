package com.hikmetcakir.practice5;

public class B extends A {

    public static void main(String[] args) {
        B b = new B();
        A a = new A();
//        b = a;
        a = b;

        try{
            int x = 5;
            throw new Error();
        }catch (Error e) {
            System.out.println("Hi");
        }
    }
}
