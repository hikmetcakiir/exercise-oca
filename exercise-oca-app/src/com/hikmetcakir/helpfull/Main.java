package com.hikmetcakir.helpfull;

import java.util.*;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isUserContinue = true;
        while(true) {
            UserInformation userInformation = new UserInformation();
            takeInformationFromUser(userInformation);

            if(Utility.validateUserInputInformations(userInformation.getKurSayisi(), userInformation.getAge(), userInformation.getOgrenimSekli()) ) {
                Discount.calculateTotalPrice(userInformation, userInformation.getKurSayisi());
                Discount.calculateAgeDiscount(userInformation, userInformation.getAge(), userInformation.getTotalPrice());
                Discount.applyAgeDiscount(userInformation, userInformation.getTotalPrice(), userInformation.getYasIndirimi());

                if(Utility.isEducationOnline(userInformation.getOgrenimSekli()))
                    Discount.calculateOnlineDiscount(userInformation, userInformation.getTotalPrice());

                Utility.printTotalPrice(userInformation.getTotalPrice());
            } else {
                Utility.printErrorMessage();
            }

            if(!isUserContinue()) break;
        }
    }

    private static void takeInformationFromUser(UserInformation userInformation) {
        System.out.println("Kaç kur eğitim görmek istediğinizi giriniz : ");
        userInformation.setKurSayisi(scan.nextInt());

        System.out.println("Yaşınızı giriniz : ");
        userInformation.setAge(scan.nextInt());

        System.out.println("Öğrenim şeklinizi seçiniz (1 = Yüz yüze eğitim , 2 = Online eğitim) :");
        userInformation.setOgrenimSekli(scan.nextInt());
    }

    private static boolean isUserContinue() {
        //sıfır verilirse program sonlanacak 1 verilirse devam edilecek.
        System.out.println("devam edecek misiniz?\n");
        int sorgu= scan.nextInt();
        return sorgu == 1;
    }

}
