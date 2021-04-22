package com.hikmetcakir.package4;

public class C extends B{

    public void publicC() {
        System.out.println("C's class public C method ");
    }

    protected void protectedC() {
        System.out.println("C's class protected C method");
    }

    void packagePrivateC() {
        System.out.println("C's class package private C method");
    }

    private void privateC() {
        System.out.println("C's class prive C method");
    }
}
