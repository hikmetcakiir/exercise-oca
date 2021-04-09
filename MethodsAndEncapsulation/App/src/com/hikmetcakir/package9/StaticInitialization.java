package com.hikmetcakir.package9;

import java.util.ArrayList;
import java.util.List;

public class StaticInitialization {

    private static final int SIZE;

    private static int one;
    private final int one2;
    private static final int two;

    private static final int three = 3;

    private static final List<String> NAMES = new ArrayList<>();
    private static final int four;

    static {
        System.out.println("first static init");
        int rows = 3;
        int columns = 4;
        SIZE = rows * columns;
    }
    {
        one2= 5;
    }
    static {
        System.out.println("second static init");
        one = 1;
        two = 2;
        one = three;
//        three = 3;
        four = 2;
//        SIZE = 5;
    }
    static {
        one = 4;
    }
    public static void main(String[] args) {

    }
}
