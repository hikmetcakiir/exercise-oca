package com.hikmetcakir.package12;

public class UnderstandingExceptions {

    public static void main(String[] args) throws Exception {
//        int[] myArray = new int[2];
//        System.out.println(myArray[5]);

        myMethod();
//        anotherMethod();
    }

    public static void myMethod() throws Exception{
        throw new Exception("Failed to load");
    }

    public static void anotherMethod() throws RuntimeException {
        throw new RuntimeException("Wrong parameter");
    }
}
