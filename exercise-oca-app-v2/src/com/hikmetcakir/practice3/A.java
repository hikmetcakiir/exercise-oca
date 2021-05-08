package com.hikmetcakir.practice3;

interface B{
    void run();
}

interface AA {
    public default void bb(){}
}

interface AAA {
    static void bb(){}
}

interface  A extends AAA, AA{

    public static void main(String[] args) {
        A(() -> {
            System.out.println("Hello World");
        });
    }

    public static void A(B b) {
        b.run();
    }
}
