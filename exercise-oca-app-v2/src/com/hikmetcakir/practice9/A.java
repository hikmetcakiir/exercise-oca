package com.hikmetcakir.practice9;


import java.util.ArrayList;
import java.util.List;

class B {
    static final int num1 = 43;
    static {
        System.out.println("B's static initializer");
    }
}
public class A  extends B{
    static final int num1 = 45;
//    static {
//        System.out.println("Hello World");
//    }
    public static void main(String[] args) {
        char c = -0;
        System.out.println("c= " + c);

        Integer num1 = new Integer(23);
        Short num2 = new Short((short)24);
        Byte num3 = new Byte("23");
        byte num4 = 23;

        System.out.println(num1 == num4);

        List<String> list = new ArrayList<>();
        list.add("0");
        list.add("2");
        list.add("3");
        list.add("4");


    }
}
