package com.hikmetcakir.package16;

class Dog {
    private String name;
    private String breed;
    private double weight;

    public Dog(String name) {
//        this.name = name;
//        breed = "husky";
//        weight = 30.0;
//        Dog(name,"husky"); // DOES NOT COMPILE
//        new Dog(name, "husky"); // compiles but does not do what we want
//        System.out.println("constructor one");
        this(name,"husky");
        System.out.println("constructor one");
    }

    public Dog(String name, String breed) {
//        this.name = name;
//        this.breed = breed;
//        weight = 30.0;
        this(name,breed,30);
        System.out.println("constructor 2");
    }

    public Dog(String name, String breed, double weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        System.out.println("constructore 3");
    }

    public void print() {
        System.out.println(name + " " + breed + " " + weight);
    }
}


public class OverloadingConstructors {

    public static void main(String[] args) {
            Dog dog = new Dog("Jimmy");
            dog.print();

            Dog dog1 = new Dog("Jimmy","shepard");
            dog1.print();

            Dog dog2 = new Dog("Rex", "german shepard",40);
            dog2.print();
    }
}
