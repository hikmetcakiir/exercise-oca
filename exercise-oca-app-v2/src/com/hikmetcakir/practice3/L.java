package com.hikmetcakir.practice3;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class L {
    public static void main(String[] args) {

        List<String> myArr = Arrays.asList("1","2","41","3","4");
        Random random = new Random();
        while(true) {
            int myRandomNumber = random.nextInt(myArr.size());
            String stringMyRandomNumber = String.valueOf(myRandomNumber);
            boolean isFound = myArr.contains(stringMyRandomNumber);
            if(isFound) {
                System.out.println("I found him : " + stringMyRandomNumber);
                break;
            }
        }
//        System.out.println("ABC".charAt(3));
//
//        LocalDate ld = LocalDate.of(2010,5,30);
//        ld = ld.plusDays(10);
//        System.out.println(ld);
//
//        StringBuilder sb = new StringBuilder(12);
//        sb.capacity();
//
//        ArrayList<String> arrList = new ArrayList<>();
////        String[] a = arrList.toArray();
//
//        LocalDate date = LocalDate.of(2018, Month.APRIL,30);
//        date.plusDays(5);

//        String[] arr = new String[] {"1","2","3","4"};
//        int[][][][] arr4D = {{{{1},{2},{3}}}};

//        String slide = "-a-----";
//        System.out.println(slide.substring(0, slide.indexOf('a')-1) + "a" + slide.replace('a','-').substring( slide.indexOf('a'))); // LEFT
//        System.out.println(slide.replace('a','-').substring(0, slide.indexOf('a')+1) + "a" + slide.substring(slide.indexOf('a')+2) ); // RIGHT
//

    }
}
