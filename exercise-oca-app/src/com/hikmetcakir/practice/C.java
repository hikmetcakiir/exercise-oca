package com.hikmetcakir.practice;

public class C {

    public static void main(String[] args) {
        String a = "a";
        char c = 'c';
        String ac = a + c;
        System.out.println("ac= " + ac);

        String myStr = "good";
        char[] myCharArr = {'g', 'o', 'o', 'd' };

        String newStr = null;
        for(char ch : myCharArr) {
            newStr = newStr + ch;
        }
        System.out.println("newStr= " + newStr);
        System.out.println("myStr= " + myStr);
        System.out.println((newStr == myStr)+ " " + (newStr.equals(myStr)));

        String s = null;
        System.out.println(s);
    }

}
