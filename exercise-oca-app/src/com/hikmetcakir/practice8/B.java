package com.hikmetcakir.practice8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B {

    public static void main(String[] args) {
//        List<Integer> a = new ArrayList<>();
//        Integer b = 2;
//        a.add(b);
//        b = 4;
//        a.add(b);
//        b = 6;
//        a.add(b);
//
//        System.out.println(a);

        Integer[] i = new Integer[5];
        Integer a = 2;
        i[0] = a;
        a = 4;
        i[1] = a;
        a = 6;
        i[2] = a;
        a = 8;
        i[3] = a;
        a = 10;
        i[4] = a;

        System.out.println(Arrays.toString(i));

    }

}
