package com.hikmetcakir.package16;

class Example {
    private String name = "dog";

    {
        System.out.println(name);
    }

    private static int COUNT = 0;

    static {
        System.out.println(COUNT);
    }

    {

        COUNT += 10;
        System.out.println(COUNT);
    }

    public Example() {
        System.out.println("constructor");
    }
}

class Demo {

    static {
        add(2);
    }

    static void add(int number) {
        System.out.print(number + " ");
    }

    Demo() {
        add(5);
    }

    {
        add(6);
    }

    static {
        new Demo();
    }

    static {
        add(1);
    }

    {
        add(8);
    }
}

public class OrderOfInitializers {
    public static void main(String[] args) {
//        Example example = new Example();
        Demo demo = new Demo();
    }
}
