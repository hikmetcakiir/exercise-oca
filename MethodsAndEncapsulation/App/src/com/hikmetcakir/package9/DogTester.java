package com.hikmetcakir.package9;

public class DogTester {

    public static void main(String[] args) {
        Dog husky = new Dog();
        System.out.println(husky.count);
        System.out.println(Dog.count);

        Dog anotherDog = new Dog();
        anotherDog.increment();

        Dog.increment();

        System.out.println(husky.count);
        System.out.println(Dog.count);

        husky = null;
        anotherDog = null;

        System.out.println(husky.count);
        System.out.println(Dog.count);
        System.out.println(anotherDog.count);

        //instance reference




        Dog.count = 10;
        Dog newDog = new Dog();
        Dog dogTwo = new Dog();
        newDog.count = 5;
        newDog.count = 11;

        System.out.println(Dog.count); // 11
    }
}
