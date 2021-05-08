package com.hikmetcakir.practice5;

public class B extends A{
    static{
        System.out.println("B's static initializer");
    }

    {
        System.out.println("B's instance initializer");
    }

    public B() {
        System.out.println("B's constructor");
    }

}
