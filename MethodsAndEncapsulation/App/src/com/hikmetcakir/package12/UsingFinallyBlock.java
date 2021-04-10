package com.hikmetcakir.package12;

public class UsingFinallyBlock {

    public static void main(String[] args) {
        String[] array = new String[5];
        array[0] = "John";

        try {
            String element = firstToUppercase(array);
            System.out.println("element=" + element);
        } catch (NullPointerException e) {
            System.out.println("Error message= " + e.getMessage());
        } finally{
            System.out.println("finally block");
        }
            System.out.println();

        String a = "hello" + 'b';
        a += 'a';
        System.out.println("a= " + a);
        // exam
        String str = "";
        try{
            str += "a";
        } catch(Exception e) {} finally{}
    }

    public static String firstToUppercase(String[] array) {
        return array[0].toUpperCase();
    }
}
