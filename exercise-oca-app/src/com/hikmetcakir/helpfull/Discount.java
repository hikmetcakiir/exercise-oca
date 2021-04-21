package com.hikmetcakir.helpfull;

public class Discount {
    public static void calculateAgeDiscount(UserInformation userInformation, int age, double totalPrice) {
        double ageDiscount;
        if(age<12) {
            ageDiscount = totalPrice * 0.40;
        } else if(age>=12 && age<=18) {
            ageDiscount = totalPrice * 0.30;
        } else if(age>=19 && age<=24) {
            ageDiscount = totalPrice * 0.20;
        } else {
            ageDiscount = 0;
        }
        userInformation.setYasIndirimi(ageDiscount);
    }

    public static void calculateOnlineDiscount(UserInformation userInformation, double totalPrice) {
        double ogrenimSekliIndirimi = totalPrice * 0.20;
        double onlineDiscount =  (totalPrice - ogrenimSekliIndirimi) * 2;
        userInformation.setTotalPrice(onlineDiscount);
    }

    public static void applyAgeDiscount(UserInformation userInformation, double totalPrice, double ageDiscount) {
        totalPrice -= ageDiscount;
        userInformation.setTotalPrice(totalPrice);
    }

    public static void calculateTotalPrice(UserInformation userInformation, int kurSayisi) {
        double totalPrice = userInformation.getKurSayisi() * 700;
        userInformation.setTotalPrice(totalPrice);
    }
}
