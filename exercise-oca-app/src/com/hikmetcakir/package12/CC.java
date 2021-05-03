package com.hikmetcakir.package12;

public class CC extends BB {
    {
        System.out.println("CC's instance initializers");
    }

    static {
        System.out.println("CC's static initializers");
    }

    public CC() {
        System.out.println("CC's constructor");
    }

    public static void main(String[] args) {
         CC cc = new CC();
    }
}
