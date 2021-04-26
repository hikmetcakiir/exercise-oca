package com.hikmetcakir.datepractice;

import java.util.*;
import java.time.*;

public class B {

    public static void main(String[] args) {
//        Date d = new Date();
//        System.out.println(d);
//
//        LocalDate da = LocalDate.now();
//        System.out.println(da);
//
//        Calendar c = Calendar.getInstance();
//        c.set(2015, Calendar.JANUARY,1);
//        Date jan = c.getTime();
//
//        System.out.println(jan);

        LocalDate date1 = LocalDate.of(2021,Month.APRIL,1);
        System.out.println("date1= " + date1);
        date1 = date1.plusWeeks(1);
        System.out.println("date1= " + date1);

        LocalTime time1 = LocalTime.of(20,20);

        System.out.println(date1.toEpochDay());

        LocalDateTime dateTime1 = LocalDateTime.of(2020,2,3,4,5);

        LocalDate date2 = LocalDate.of(2021,Month.MAY,1);
        if(date1.isBefore(date2)){
            System.out.println("Before");
        }

    }

}
