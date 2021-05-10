package com.hikmetcakir.practice7;

import java.util.ArrayList;
import java.util.List;

public class B extends A {

    public void a() {
        super.A();
    }

    public static void main(String[] args) {
        List<String> i = new ArrayList<>();
        i.add("HelloWorld");
        i.add(1,"Lion");
        i.add(2,"Cat");
//        i.add(4,"Tiger"); // java.lang.IndexOutOfBoundsException
        System.out.println(i);
//        i.get(12); // java.lang.IndexOutOfBoundException: Index: 12, Size: 3

    }

}
