package com.hikmetcakir.helpfull;

public class Utility {
    public static boolean validateUserInputInformations(int kurSayisi, int age, int ogrenimSekli) {
        return kurSayisi>0 && age>0 && (ogrenimSekli == 1 || ogrenimSekli == 2);
    }

    public static void printErrorMessage() {
        System.out.println("Eksik veya yanlış bilgi girdiniz, lütfen tekrar deneyin.");
    }

    public static void printTotalPrice(double totalPrice) {
        System.out.println("Toplam ücret: " + totalPrice + "TL");
    }

    public static boolean isEducationOnline(int ogrenimSekli) {
        return ogrenimSekli == 2;
    }

}
