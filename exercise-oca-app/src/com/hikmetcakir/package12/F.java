package com.hikmetcakir.package12;

public class F {

    public static void main(String[] args) {
        Integer i = new Integer(42);
        Long ln = new Long(42);
        Double d = new Double(42.0);

//        if(i == ln) {} // DOES NOT COMPILE
        if( i.equals(ln) ) {
            System.out.println("Equal to");
        } else {
            System.out.println("Not Equal to");
        }

//        int[] a = null;
//        Integer ic = a[0];



    }

}
