package com.hikmetcakir.package9;

public class MethodReturnType {

    public void jump() {} // return type void

    public void jump2() { // return type void
        return; // return is a redundant
    }

    public String jump3() {
        return "";
    }

//    public String jump4() {
        // DOES NOT COMPILE
//    }

//    public jump5() {}
//
//    String jump6(int a) {
//        if( a == 5) {
//            return "";
//        }
//    }

    int getInt() {
        return 9;
    }

    int getLong() {
        return (int)9L;
    }

    boolean isTrue() {
//        return 5 < 10;
        return 5 == 5;
    }

    public void test() {    }

//    public void 2test() {}

//    public test void() {}

//    public void void() {}

    public void $test() {}

    public void _test() {}

//    public void(){}

}
