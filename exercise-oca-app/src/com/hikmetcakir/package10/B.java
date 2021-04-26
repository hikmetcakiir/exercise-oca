package com.hikmetcakir.package10;

import java.io.IOException;

public class B extends A {
    public void a() throws IOException {

    }
    public static void main(String[] args) {
        Boolean b = new Boolean("true");
        Boolean bb = new Boolean(true);

        System.out.println("b= " + b);
        System.out.println("bb= " + bb);

        Boolean bbb = new Boolean("       tRuE");

        System.out.println("bbb= " + b);

        Boolean bbbb = Boolean.parseBoolean("TRuE");
        System.out.println("bbbb= " + bbbb);

        Boolean bbbbb = Boolean.valueOf("TrUE");
        System.out.println("bbbbb= " + bbbbb);

        Boolean bbbbbb = new Boolean(null);

        System.out.println("bbbbbb= " + bbbbbb);

        Integer i = new Integer(null);
        System.out.println("i= " + i);
    }

    public B(){};

    public void egg() {};
}
