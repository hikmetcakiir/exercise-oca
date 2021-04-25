package com.hikmetcakir.practice8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A {
    public static int[][] k = new int[5][5];
    public static void main(String[] args) {
//        char[] c = {'c', 'd', 2};
//        String s = new String(c);
//        System.out.println("s= " + s);
////        StringBuilder sb = new StringBuilder();
////        sb.replace()
////        sb.indexOf();
////        sb.re
//
//

//        int[] i [] = new int[5][];
        int[][] i = new int[5][5];
        int counter = 0;
        for(int j = 0; j < 5; j++) {
            for(int k = 0; k < 5; k++) {
                System.out.println(counter + " " + A.k[j][k]);
                counter++;
            }
        }

        int[] ar = new int[] {2,3};
        int[][] arr2 = new int[][]{{2,3,4},{2,3,4}};

        StringBuilder sb = new StringBuilder("hello");

        List s1 = new ArrayList();
        s1.add("a");
        s1.add("a");
        s1.add("b");
        s1.add("c");
        s1.add("a");
        s1.remove("a");
        s1.removeAll(Arrays.asList("a"));
        System.out.println(s1);

        sb.replace(0,2,"Abc");
        System.out.println(sb);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for(Integer element : list) {
            System.out.println("Hello World!!");
            list.add(11);
        }
    }
}
