package com.hikmetcakir.practice4;

public interface A {
    final static public int x = 5;
    default  void getName() {
        System.out.println("Base 1");
    }
}
