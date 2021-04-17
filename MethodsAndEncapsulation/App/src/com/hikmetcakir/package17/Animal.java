package com.hikmetcakir.package17;


public abstract class Animal implements Walk, Run {
    int age;
    int y = 3;
    {
        y = 6;
        int x = 5;
    }
    static {
        System.out.println("Hello World From Animal Class");
    }
    {
        System.out.println("Animal Instance initializer");
    }
    public Animal(int age) {
        System.out.println("Animal");
        this.age = age;
    }

    public Animal() {

    }
    public void eat() {
        System.out.println("Animal is eating");
    }

    public double getAverageWeight()   {
        return 10.0;
    }

//    public static abstract void run(); // illegal combination
//
//    public abstract void run() {
//        System.out.println("running");
//    }

//    public double getAverageWeight()

    public abstract int getWeight();


    @Override
    public int getSpeed() {

        return 0;
    }
}
