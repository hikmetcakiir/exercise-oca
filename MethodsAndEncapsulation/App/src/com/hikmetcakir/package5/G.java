package com.hikmetcakir.package5;

public class G extends F{

    public void x() {
        secondMethod();
        F f = new F();
    }
    public static void main(String[] args) {
        F f =new F();
        getArray();
    }

    static String getArray(int... array){
        System.out.println("getArray inside");
        return null;
    }
}
