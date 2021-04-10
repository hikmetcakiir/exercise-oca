package com.hikmetcakir.package12;

import java.io.IOException;

class MuseumClosed extends RuntimeException{}

class MuseumClosedForLunch extends MuseumClosed{}

public class CatchingDifferentExceptions {
    public static void main(String[] args) {
//        try{
//            visitMuseum();
//        }catch (MuseumClosedForLunch e){
//            System.out.println("Closed for lunch");
//        }catch (MuseumClosed e) { // super class
//            System.out.println("Closed");
//        }
        System.out.println(calculate());
//        try{
//            throw new RuntimeException();
//        }catch (Exception e) {
//            System.out.println("exception");
//        }catch (IllegalArgumentException e){
//            System.out.println("illegal argument");
//        }



    }

    public static String calculate() {
        String result = "";
        String str = null;

        try {
            try{
                result += "start";
                str.length();
                result += "end";
            }catch (NullPointerException e) {
                result += "npe";
                System.exit(0);
                throw new RuntimeException();
            }finally {
                result += "finally";
                throw new Exception();
            }
        }catch (Exception e){
            result += "finished";
        }

        return result;
    }
    public void a() throws Exception {
        throw new Exception();
    }
    public static void visitMuseum() {
        boolean b = Math.random() < 0.5;
        if(b) {
            throw new MuseumClosed();
        }

        throw new MuseumClosedForLunch();
    }
}
