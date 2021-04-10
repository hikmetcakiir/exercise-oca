package com.hikmetcakir.package11;

public class Exception3 {

    public static void bad() {
        try {
            eatCarrot();
        }catch (Exception ex) {
            System.out.println("Hello World");
        }
    }

    public static void good() throws Exception{
        eatCarrot();
    }

    private static void eatCarrot() {}


}
