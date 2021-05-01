package com.hikmetcakir.package12;

import java.time.Period;

public class BB extends AA {
    {
        System.out.println("BB's instance initializers");
    }

    static {
        System.out.println("BB's static initializers");
    }

    public BB() {
        System.out.println("BB's constructor");
    }

    public static  void main(String[] args) {
        int i = 30;
        char c = 42;
//        c = i;
        i = c;
        System.out.println();

        Integer ik = 12;
        ik.intValue();

        byte  val = 127;

        System.out.println(new Boolean("truE "));

        System.out.println(Boolean.parseBoolean("trUe "));
        System.out.println(Boolean.valueOf("tRue"));
    }
}
