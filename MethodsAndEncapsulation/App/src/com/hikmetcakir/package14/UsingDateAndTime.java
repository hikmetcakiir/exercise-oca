package com.hikmetcakir.package14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class UsingDateAndTime {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2030, Month.JANUARY,10);
        System.out.println(date);
        date = date.plusDays(5).plusMonths(2);
        System.out.println(date);

        LocalTime time = LocalTime.of(10,30);
        System.out.println();
        time = time.plusHours(2).plusMinutes(20);
        System.out.println(time);

        LocalDateTime localDateTime = LocalDateTime.of(date,time);
        System.out.println(localDateTime);
        localDateTime = localDateTime.minusHours(10).plusDays(2).plusWeeks(1);
        System.out.println(localDateTime);

        // before java 8
        Date myDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(myDate);
        calendar.set(Calendar.DATE, 1);
        calendar.set(Calendar.MONTH, 2);
        myDate = calendar.getTime();
        System.out.println(myDate);

        System.out.println("********************");

        // exam tricks
        LocalDate id = LocalDate.of(2010,Month.APRIL,1);
        id.plusDays(10); // result is ignore because all dates class are immutable
        System.out.println(id);


//        id.plusMinutes(10);
        LocalTime it = LocalTime.of(12,42);
//        it.addDays(3);

    }
}
