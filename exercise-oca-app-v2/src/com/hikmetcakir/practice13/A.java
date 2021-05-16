package com.hikmetcakir.practice13;


import java.io.IOException;

class AnimalsOutForAWalk extends RuntimeException{}
class ExhibitClosed extends RuntimeException{}
class ExhibitClosedForLunch extends ExhibitClosed{}

public class A extends B {
    public static void main(String[] args) throws Exception {
//        a();
        try{
//            a();
            System.out.println("Hello World!");
        }catch (Exception e) {

        }catch (Error e) {
        }

    }

    public static void b() throws Exception {
//        a();
    }

    public  void a() throws RuntimeException {
        throw new RuntimeException();
    }
}
