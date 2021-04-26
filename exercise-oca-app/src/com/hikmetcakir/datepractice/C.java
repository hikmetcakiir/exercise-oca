package com.hikmetcakir.datepractice;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class C {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2021, Month.APRIL,26);
        System.out.println("date1= " + date1);
        System.out.println("format date1= " + date1.format(DateTimeFormatter.ISO_LOCAL_DATE));

        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDateTime.format(date1));
    }
}
