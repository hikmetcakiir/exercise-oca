package com.hikmetcakir.package9;

import java.util.Arrays;

public class OverloadingMethod {

    public void walk(int miles) {}
    public void walk(short feet) {}

    public boolean walk(){
        return false;
    }

    void walk(int miles, short feet) {
    }

    public void walk(float miles) {}
//    public int walk(float miles){} //does not complie
//    public static void walk(float miles) {}

    public void walk(int[] lengths) {}

//    public void walk(int... varargs){}

    public static void run(int length) {}
    public static void run(Integer length){}
    public static void run(double kilometers) {}

    public static void main(String[] args) {
//        Arrays.toString(new int[] {1,2,3});
////        Arrays.binarySearch()
//        run(9L);
//        jump("test");
//        jump(25);
//
//        sum(1,2);

        count(true, new boolean[2]);
    }

    public static void jump(String s ){
        System.out.println("string");
    }

    public static void jump(Object o ){
        System.out.println("Object");
    }

//    public static int sum(int a, int b) {
//        System.out.println("int sum");
//        return a + b;
//    }

//    public static long sum(long a, long b) {
//        System.out.println("long sum");
//        return a + b;
//    }

//    public static Integer sum(Integer a, Integer b) {
//        System.out.println("integer sum");
//        return a + b;
//    }

    public static void subtract(int... sums){

    }
    public static int count(boolean b, boolean... b2) {
        return b2.length;
    }
    public static int sum(int... sums) {
        System.out.println("sum var args");

        int sum = 0;
        for(int i : sums) {
            sum += i;
        }
        return sum;
    }
}
