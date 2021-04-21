package com.hikmetcakir.hidingvariables;

public class A {
    public static void main(String[] args) {
        int i = 100;
//        char c = i;
        char c = 'a';
//        long b = c;
//        char bb = 100L;
        char cc = 'a';
        cc++;
        System.out.println("cc=" + cc);
        System.out.println("c=" + c);
    }
}
