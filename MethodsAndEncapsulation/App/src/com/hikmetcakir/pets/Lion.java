package com.hikmetcakir.pets;

public class Lion {
    protected boolean isCanHop = true;
    private int age = 10;
    double feet = 2.4D;
    public String color = "Yellow";

    protected void printProperties(){
        System.out.println("isCanHop" + this.isCanHop);
        System.out.println("age= " + this.age);
        System.out.println("feet= " + this.feet);
        System.out.println("color= " + this.color);
    }
}
