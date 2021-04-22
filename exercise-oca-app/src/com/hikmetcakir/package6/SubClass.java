package com.hikmetcakir.package6;
interface FG {

}
public class SubClass extends Super {
    @Override
    public String toString() {
        return super.toString() + "3";
    }

    public static void main(String[] args) {
        System.out.println(new SubClass());
    }
}
