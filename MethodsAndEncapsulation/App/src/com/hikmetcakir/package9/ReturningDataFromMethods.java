package com.hikmetcakir.package9;

public class ReturningDataFromMethods {

    public static void main(String[] args) {
        int number = 2;
        String word = "xyz";

        number(number);
        System.out.println("number= " + number);

        word = word(word);
        System.out.println("word= " + word);
    }

    public static int number(int number) {
        number++;
        return number;
    }

    public static String word(String word) {
        word += "a";
        return word;
    }
}

