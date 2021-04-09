package com.hikmetcakir.package9;

import java.util.ArrayList;
import java.util.List;

public class Final {
    // as known constant variable

    private static final int SIZE = 10;

    private static final List<String> VALUES = new ArrayList<>();

    public static void main(String[] args) {
        int[] myArray = new int[SIZE];

//        SIZE = 12; // DOES NOT COMPILE
//        SIZE++;
        int doubleSize = 2 * SIZE;
        for(int i = 0; i < SIZE; i++) {
            System.out.println(myArray[i]);
        }

        VALUES.add("changed");

        VALUES.add("changed");
//        VALUES = new ArrayList<>();

        final int myNumber = 10;
//        myNumber = 11;
    }
}
