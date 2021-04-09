package com.hikmetcakir.package8;

public class A {

    protected A(){
        System.out.println("default parameter constructor");
    }

    protected A(int a) {
        System.out.println("1 parameter constructor");
    }

    public A(int b,int c){
        System.out.println("2 parameter constructor");
    }
    public static void main(String[] args) {
        int x = 4;
        getty();
        if(x > 5) {
            double avg = 0;
            System.out.println("avg= " + avg);
        }
        else {

        }
        A a = new A();
//        A a = new A();
//        a.print(2,(short)3);
//        a.gett2y();
    }
    public static void getty(){
        return;
    }

//    public void print(int a,short b){
//        System.out.println("Public");
//    }
//
//    private void print(int b, short a){
//        System.out.println("Private");
//        ;
//    }
    static
    {
        System.out.println("Static hello world");
    }
    {
        System.out.println("Hello World");
    }
    public void gett2y(){
//        print(2,(short)3);
    }
}
