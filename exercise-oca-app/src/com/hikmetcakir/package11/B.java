package com.hikmetcakir.package11;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
//import java.sql.Date;

public class B extends A {

    public B() {

    }

    public int publicVarB;
    protected int protectedVarB;
    int packagePrivateVarB;
    private int privateVarB;

    public void b() {
    }

    public String a() throws IOException {
        return null;
    }

    String value = "Hello World";

    {
        System.out.println(value);
    }

    {
        System.out.println("Hello World");
    }

    private int temp;

    public void temp(int temp1) {
        int temp = 0;
        {
//            int temp = 0;
        }

//        do
//            System.out.println("b");
//        while(false);
////        for(;false;) {
////
////        }
//        if(false){
//
//        }
//        while(true) {
//
//        }


    }

    public static void main(String[] args) throws Exception {
        B[] b = new B[3];
        for (B ba : b) {

        }
//        super();
//        int dayOfWeek = 5;
//        switch (dayOfWeek) {
//            case 0 :
//                System.out.println("0");
//            default :
//                System.out.println("default");
//                break;
//            case 6 :
//                System.out.println("6");
//        }
//
//        String value = "Hello World";
//
//        B b = new B();

//        int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
//        System.out.println(myComplexArray.length);
//        System.out.println(myComplexArray[0].length);

//        String str1 = "a";
//        str1 = str1.concat(str1);
//        System.out.println("str1= " + str1);
//        "ABC".startsWith("c");
//        String ss = "a";
//        ss += 'c';
//
//        StringBuilder sb = new StringBuilder("Hello");
//        char char1 = sb.charAt(6);
////
//        String str1 = "Hello";
//        String str2 = "Hello".trim();
//        System.out.println(str1 == str2);

//        int[] values = new int[] {5,4,3,2,1};
//        Arrays.sort(values);
//        for(int value : values) {
//            System.out.print(value + " ");
//        }

        String[] values = {"1", "115", "400", "a", "A", "aa", "AA", "Aaa", "3333333"};
        Arrays.sort(values);
        for (String value : values) {
            System.out.print(value + " ");
        }

        ArrayList<String> al = new ArrayList<>();
        al.add(0, "hikmet");
        al.add(1, "hikmet");
        System.out.println(al);

            int leaders = 10 * (2 + (1 + 2 / 5));
            int followers = leaders * 2;
            System.out.print(leaders + followers < 10 ? "Too few" : "Too many");



        }


    }
