package com.hikmetcakir.package12;

public class AA {
    {
        System.out.println("AA's instance initializers");
    }

    static {
        System.out.println("AA's static initializers");
    }

    public AA(){
        System.out.println("AA's default constructor");
    }
}
