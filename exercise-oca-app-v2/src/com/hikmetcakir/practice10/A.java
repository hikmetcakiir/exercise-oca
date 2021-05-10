package com.hikmetcakir.practice10;

public class A {
    public static void main(String[] args) {
        double d = 2e2;
        System.out.println("d= " + d);
        double x1 = 01234.;
        System.out.println("x1= " + x1);

        double x2 = 1.;
        System.out.println("x2= " + x2);

        short x3 = 23;
        char x4 = 'c';
        x3 += x4;

//        int x5 = 123l; // DOES NOT COMPILE
        Integer x5 = 23;
        System.out.println("ABC".equals((Integer)null));

        short val = 2;
        byte i = (short) 122;

        Book :
        while(i > 100) {
            Book2 : while(i > 102) {
                System.out.println(i);
                if(i == 103)
                break Book;
                i--;
            }
        }
    }
}
