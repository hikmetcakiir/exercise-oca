package com.hikmetcakir.package17;

public class Bird extends Animal{

    public void fly() {
        System.out.println("Bird is flying");
    }

    public void eat(int amount) {
        System.out.println("Bird is eating " + amount + " units of good");
    }

    @Override
    public int getWeight() {
        return 0;
    }
}
