package com.hikmetcakir.practice2;

public class Marsupial {

    public static boolean isBiped() {
        return false;
    }

    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs : " + isBiped());
    }
}
