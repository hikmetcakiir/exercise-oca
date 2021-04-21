package com.hikmetcakir.helpfull;

public class UserInformation {
    private int kurSayisi;
    private int age;
    private int ogrenimSekli;
    private double yasIndirimi;
    private double totalPrice;

    public UserInformation() {
    }

    public UserInformation(int kurSayisi, int age, int ogrenimSekli, double yasIndirimi, double totalPrice) {
        this.kurSayisi = kurSayisi;
        this.age = age;
        this.ogrenimSekli = ogrenimSekli;
        this.yasIndirimi = yasIndirimi;
        this.totalPrice = totalPrice;
    }

    public int getKurSayisi() {
        return kurSayisi;
    }

    public void setKurSayisi(int kurSayisi) {
        this.kurSayisi = kurSayisi;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getOgrenimSekli() {
        return ogrenimSekli;
    }

    public void setOgrenimSekli(int ogrenimSekli) {
        this.ogrenimSekli = ogrenimSekli;
    }

    public double getYasIndirimi() {
        return yasIndirimi;
    }

    public void setYasIndirimi(double yasIndirimi) {
        this.yasIndirimi = yasIndirimi;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
