package com.hikmetcakir.package17;

import java.io.IOException;

public class Dog extends Animal implements HasTail, CanRun{

    static {
        System.out.println("Dog Static Initializer");
    }
    public Dog(int age) {
        super(age);
        System.out.println("Dog");
    }

    public void eat() {
        super.eat();
        System.out.println("dog eating");
    }

    public double getAverageWeight() {
        return super.getAverageWeight() + 20;
    }

    @Override
    public int getTailLength() {
        return 0;
    }

    @Override
    public int getWeight() {
        return 0;
    }

    @Override
    public void run(int speed) {

    }
}
