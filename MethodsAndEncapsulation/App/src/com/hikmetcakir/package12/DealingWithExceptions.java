package com.hikmetcakir.package12;

public class DealingWithExceptions {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try{
            int result = divide(a, b);
            System.out.println("result= " + result);
            int b2 = 4;
        }catch (ArithmeticException myException) {
//            myException.printStackTrace();
            System.out.println("b= " + b);
            System.out.println("Error dividing message= " + myException.getMessage());
        }
    }

    private static int divide(int a, int b) {
        return a / b;
    }
}
