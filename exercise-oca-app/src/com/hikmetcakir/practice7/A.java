package com.hikmetcakir.practice7;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.*;

import java.time.*;

public class A {

    public static void main(String[] args) {
////        String a = new String("hikmetcakir");
////        System.out.println(a.charAt(0));
////        System.out.println(a.charAt(-1));
////        System.out.println(a.charAt(9));
////
////        System.out.println(a.indexOf('i'));
////        System.out.println(a.indexOf('i',1));
////        System.out.println(a.indexOf("ik",2));
////        System.out.println(a.indexOf("t",1));
////
////        String b = "animals";
////        System.out.println(b.substring(3,2));
////
////        String [] a = {"Abc", "ab", "Cd", "Cde", "0", "43", "12", "123", "01"};
////        sort(a);
////        for(String b : a) {
////            System.out.print(b + " ");
////        }
//
////        List<Integer>  a = new ArrayList<>();
////        a.add(1);
////        a.add(2);
////        a.remove(new Integer(2));
////        System.out.println(a);
//
////        System.out.println("ABC".startsWith("A",1));
////        System.out.println("ABCa-1".contains("A"));
//
//        //equals, equalsIgnoreCase, substring, indexOf, charAt, toUpperCase, toLowerCase, startsWith, endsWith, replace, length(), contains
//        //indexOf, replace
//        StringBuilder sb1 = new StringBuilder();
//        StringBuilder sb2 = new StringBuilder("abc");
//        StringBuilder sb3 = new StringBuilder(30);
//
//        sb2.append(2);
//        // append, insert, reverse, delete, deleteCharAt, isEmpty, size, toString()
//
////        StringBuilder s = new String("Hello"); // DOES NOT COMPILE
//        StringBuilder sb = new StringBuilder("Hello World");
//        sb.append("!");
//        sb.insert(5,'-');
//        System.out.println(sb);;
//        sb.delete(6,7);
//        System.out.println("new : " + sb);
//        sb.insert(6,"-1");
//        System.out.println(sb);
//        sb.deleteCharAt(6);
//        System.out.println("delete char(6)= " + sb);
//        sb.deleteCharAt(6);
//        System.out.println(sb.toString());
//        System.out.println(sb);
//
//        // StringBuilder methods
//
//        sb.replace(0,1,"hello");
//        System.out.println(sb);
//        sb.indexOf("hello");
//        sb.substring(0);
//        System.out.println(sb);
////        System.out.println("Abc".contains("b"));
//
//
//        //String builder methods, append, insert, delete, deleteCharAt, toString, indexOf, substring, charAt, length(), reverse
////        sort(sb);
//
//
//        ArrayList al = new ArrayList();
//        al.add(0);
//        al.add(1);
//        al.add("Hello World!");
//        al.add(true);
//        al.add(Boolean.parseBoolean("TruE"));
//        System.out.println(al);
//        al.add(2,2);
//        System.out.println(al);
//        System.out.println("remove = " + al.remove(true));
//        System.out.println(al);
//        System.out.println(al.contains(1));
//
//        StringBuilder sb5 = new StringBuilder("Hello");
//        if(sb5.equals("Hello")) {
//            System.out.println("Equal to ");
//        }
//        System.out.println("sb5 old= " + sb5);
//        sb5.append("Jessica",0,4);
//        System.out.println("sb5 new= " + sb5);
//
//        System.out.println(Boolean.parseBoolean("tRue"));
//        Collections.sort(al);
//        //list methods add, set, contains, isEmpty, size, remove
////
        StringBuilder sb = new StringBuilder("HelloWorld!");
//        sb.delete(0, sb.length() + 50);
        sb.setLength(5);
//        sb.setLength(-10);
        sb.delete(0, sb.length() + 50);
        sb.append("Jessica  ");
//        sb.setLength(2);
//        sb.setLength(20);
//        sb.append(20);
        System.out.println(sb);

        System.out.println(sb.length());
//
//

        String b = "Hello";
//        System.out.println("Abc".compareTo("abc"));
        String Object = "hello";
        A A = new A();

        LocalDate ld = LocalDate.of(2010,2,28);
        System.out.println(ld);
    }
}
