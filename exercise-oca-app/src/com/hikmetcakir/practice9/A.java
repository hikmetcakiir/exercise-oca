package com.hikmetcakir.practice9;

import java.util.ArrayList;
import java.util.List;

public class A implements b,c{

    public void c() {
        System.out.println("c");
    }

    @Override
    public void xy() {

    }

    public static void main(String[] args) {
        List<Integer> i = new ArrayList<>();
        i.add(1);
        i.add(2);
        i.add(3);
        i.add(4);
//        i.set()

//        for(Integer b : i ){
//            i.remove(2);
////        }
//        throw new Error();
        Integer ab = new Integer(2);
        System.out.println(ab.intValue());
        Double d = new Double(2);
        System.out.println(d);
//        Boolean.parseBoolean(true)
        Boolean.valueOf(true);
        Integer.valueOf(2);
        Short.valueOf((short) 2);

        Integer.parseInt("12");

        int x  = 0;
//        x > 0 ? a() : a(2);
    }

    public static void a() {}

    public static void a(int a) {}

//    public int a(int a,int b) {}

//    public static int a (int a,short b) {}
}
