package com.hikmetcakir.practice2;

import java.util.*;

public class CA {

    private final int x;

    public CA() {
       x = 5;
    }
    public static void main(String[] args) {
        List<String> ar = Arrays.asList("a","A","aA","Aa","1","23","12","93","1245","aBc");
        Collections.sort(ar);
        System.out.println(ar);

        "ABC".compareTo("a");
//    for(int i = 0; i < 30 ; i+= 3) {
//        System.out.println(i);
//    }
        List<String> a = new ArrayList<>();
        a.sort(Comparator.comparing(String::toString));

    }
}
