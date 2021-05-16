package com.hikmetcakir.practice15;

interface FIRST{
    public static void A(){
        System.out.println("A");
    }
}

interface SECOND extends FIRST{
    default void A() {
        System.out.println("SECOND");
    }
}

//class Ankara implements F{
//
//}

public class F implements SECOND, FIRST {
    public static void main(String[] args) {
        new F().a();
    }

    public void a() {

    }


}
