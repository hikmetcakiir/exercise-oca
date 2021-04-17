package com.hikmetcakir.package15;

class Dog {

    private String color;
    private final int x;

    public Dog(String color)  {
//        color = xy;
        System.out.println("constructor");
        this.color = "grey";
        x = 5;
    }

    public void printColor() {
        System.out.println("color= " + this.color);
    }

//    private static final int xx;
//    { xx = 5;}
//    public dog() {}

    public void dog() {} // this is not a constructor since it has return type
}

class Cat {
    private String color;
    private int height;
    private int length;

    public Cat(int length, int theHeight) {
//        length = this.length;
        this.length = length;
        height = theHeight;
        this.color = "white";
    }

    public void printInfo() {
        System.out.println("Color= "+ this.color + ", height= " + this.height + ", length= " + this.length);
    }
}

public class ClassConstructors {

    public static void main(String[] args) {
        Dog dog = new Dog("123");
        dog.printColor();

        Cat cat = new Cat(10,20);
        cat.printInfo();
    }
}


