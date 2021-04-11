package com.hikmetcakir.package14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class CreatingDateAndTime {

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate localDate = LocalDate.of(2017, Month.JANUARY,2);
        LocalTime localTime = LocalTime.of(10,20);

        System.out.println();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(LocalDateTime.of(localDate,localTime));

        System.out.println();
        //before Java 8
        System.out.println(new Date());

        Calendar calendar = Calendar.getInstance();
        calendar.set(2021,Calendar.JANUARY,5);
        Date january = calendar.getTime();
        System.out.println(january);
    }

}
