package com.hikmetcakir.package7;

public class J extends C{
    int publicVar = 550;
    {
        int y = 3;
    }
    {
        System.out.println("First Instance initializers");
        x= 4;
    }
    int x;

    {
        System.out.println("second instance initializer");
    }
    {
        System.out.println(x);
    }
    public static void main(String[] args) {
        J j = new J();
//        j.print();
    }

    public void print() {
        System.out.println(super.publicVar);
    }
}
