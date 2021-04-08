package com.hikmetcakir.package5;

import com.hikmetcakir.package4.A;

public class F extends A{
    public static void main(String... args) {
        A a = new A();
//        a.secondMethod();

    }

    public void x(){
        F f = new F();
        f.secondMethod();
        secondMethod();
    }
}
