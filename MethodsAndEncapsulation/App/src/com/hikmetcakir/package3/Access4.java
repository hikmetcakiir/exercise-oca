package com.hikmetcakir.package3;

import com.hikmetcakir.package2.Access3;

public class Access4 extends Access3 {
    public void print(){
        printHelloWorld();
    }

    public static void main(String... args) {
        Access4 a = new Access4();
        a.printHelloWorld();
    }
}
