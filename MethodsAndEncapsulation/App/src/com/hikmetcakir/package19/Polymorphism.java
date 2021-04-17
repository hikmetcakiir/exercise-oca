package com.hikmetcakir.package19;

import com.hikmetcakir.package17.*;

public class Polymorphism {

    public static void main(String[] args) {
        Husky husky = new Husky(5);

        Dog dog = husky; // another reference to Husky object in memory


        HasTail hasTail = husky;
        System.out.println("tailLength= " + hasTail.getTailLength());

        CanRun canRun = husky;
        canRun.run(5);

        Animal animal = husky;

        Animal cat = new Cat(2);
        Cat myCat = (Cat) cat;

        myCat.getWeight();

        Object object = husky;
        dog.eat();

//        Bear bear = (Bear) "Test";


        Animal rabbitAnimal = new Rabbit();
        rabbitAnimal.eat();


    }
}
