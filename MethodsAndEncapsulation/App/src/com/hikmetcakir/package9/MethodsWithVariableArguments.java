package com.hikmetcakir.package9;

import java.util.Arrays;

public class MethodsWithVariableArguments {

    public void jump1(int... numbers) {   }

    public void jump2(int start, int... numbers) {
    }

//    public void jump3(int... numbers, int start) {} //Varg args the last argument to parameter list

//    public void jump(int... start, int... numbers) {  }

    public void jump5(int[] start, int[] numbers) {
    }




    public static void main(String[] args) {
        jump11();
        jump10(1);
        jump10(2, 3);
        jump10(4, 5, 6, 7);
        jump10(1, new int[]{4, 5, 6, 7}); // redundant array creation

//        jump10(1,null); // Null pointer exception

        run(2,3,4,5,6,7,8,9,10);
    }

    public static void run(int... numbers) {
        for(int number : numbers) {
            System.out.println("number= " + number);
        }

        System.out.println(Arrays.toString(numbers));
    }

    public static void jump10(int start, int... numbers) {
        System.out.println("start= " + start + " numbers.length=" + numbers.length);
    }

    public static void jump11(  int... numbers) {
        System.out.println("start= " +  0 + " numbers.length=" + numbers.length);
    }
}
