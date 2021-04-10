package com.hikmetcakir.package11;

public class Exception2 {

    public static void main(String[] args) {
//        try{
//            System.out.println("1");
//            fall();
//        }catch (RuntimeException   ex) {
//            System.out.println("2");
//        }finally {
//
//        }

        try {
            throw new RuntimeException();
        }catch (StackOverflowError ex){
            System.out.println("1");
            throw new RuntimeException();

        }finally{

            System.out.println("2");
        }
    }

    public static void fall() {
        throw new RuntimeException();
    }
}
