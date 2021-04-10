package com.hikmetcakir.package12;


import java.io.IOException;

class NoMoreMeatException extends Exception {}

class NoMorePlantsException extends RuntimeException{}

interface Omnivore {
    void eatMeat(int amount) throws NoMoreMeatException;

    void eatPlants(int amount);
}

class Bear implements Omnivore{

    @Override
    public void eatMeat(int amount) throws NoMoreMeatException {
        if(amount <= 0) {
            throw new NoMoreMeatException();
        }

        System.out.println("Eating meat");
    }

    @Override
    public void eatPlants(int amount) throws NoMorePlantsException{
        if(amount <= 0) {
            throw new NoMorePlantsException();
        }

        System.out.println("Eating plants");
    }
}

public class MethodsWithExceptions {

    public static void main(String[] args) {
        Bear bear = new Bear();

        try {
            bear.eatMeat(2);
        }catch (NoMoreMeatException e) {
            System.out.println("bear is hungry");
        }
    }
}
