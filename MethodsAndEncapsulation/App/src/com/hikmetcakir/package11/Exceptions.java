package com.hikmetcakir.package11;

public class Exceptions {

    public static void main(String[] args) {
        try {
            System.out.println("1");
            fall();
            System.out.println("2");
        }catch (Exception exception) {
//            fall();
            System.out.println("3");
        }finally {
            System.out.println("4");
//            fall();
        }

         try{
             System.out.println("1.1");
             fall();
         }finally {
             System.out.println("1.2");
         }

    }
    public static void fall() {
        throw new RuntimeException();
    }
}
