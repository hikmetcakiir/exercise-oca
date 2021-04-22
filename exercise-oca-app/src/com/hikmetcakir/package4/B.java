package com.hikmetcakir.package4;

public class B extends A {
    public static int ab = 3;

    public void publicB() {
        System.out.println("B's class public B method ");
    }

    protected void protectedB() {
        System.out.println("B's class protected B method");
    }

    void packagePrivateB() {
        System.out.println("B's class package private B method");
    }

    private void privateB() {
        System.out.println("B's class prive B method");
    }
}
