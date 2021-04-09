package com.hikmetcakir.package9;

public class MethodParameterList {
    int getZero() { // 0 arguments
        return 0;
    }

    int increment(int number) { // 1 argument
        return number + 1;
    }

    int sum(int a, int b) { // 2 argument
        return a + b;
    }

    int plusMinus(int a, int b,int c) { // 3 arguments
        return a + b - c;
    }

    double average(double a, double b, double c, double d) {
        return a + b + c + d / 4;
    }

//    void test()

//    void test(int a;int b) {} // DOES NOT COMPILE

    void test(int a, int b) {}

//    void test2(int a);


}
