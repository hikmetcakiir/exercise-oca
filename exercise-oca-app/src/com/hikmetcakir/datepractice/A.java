package com.hikmetcakir.datepractice;

import java.time.*;

public class A {

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        System.out.println();

        LocalDate date1 = LocalDate.of(2015,Month.JANUARY,31);
        LocalDate date2 = LocalDate.of(2015,1,31);

        System.out.println("date1= " + date1);
        System.out.println("date2= " + date2);

        System.out.println();

        LocalTime time1 = LocalTime.of(10,15);
        LocalTime time2 = LocalTime.of(10,15,1);
        LocalTime time3 = LocalTime.of(10,16,1,3);

        System.out.println("time1= " + time1);
        System.out.println("time2= " + time2);
        System.out.println("time3= " + time3);

        System.out.println();

        LocalDateTime dateTime1 = LocalDateTime.of(2021,04,26,22,20);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);

        System.out.println("dateTime1= " + dateTime1);
        System.out.println("dateTime2= " + dateTime2);
    }
}
