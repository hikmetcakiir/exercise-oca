package com.hikmetcakir.package20;

public class Main {

    public static void main(String[] args) {
        Primate primate = new Primate();
        primate.firstName = "Jon";
        primate.lastName = "Stark";
        primate.printFullName();

        System.out.println();

        Human human = new Human();
        human.firstName = "Hikmet";
        human.lastName = "Cakir";
        human.printFullName();

        System.out.println();

        primate = human;
        primate.printFullName();

        System.out.println();

        Primate primate1 = new Human();
        primate1.printFullName();


    }
}
