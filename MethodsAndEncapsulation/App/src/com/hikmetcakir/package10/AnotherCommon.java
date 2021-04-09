package com.hikmetcakir.package10;

public class AnotherCommon {


    public static void main(String[] args) {
        Common common = new Common();
        common.publicPrint();
        common.defaultPrint();
        common.protectedPrint();
        //common.privatePrint(); // We cant access private method so Does Not Compile

        System.out.println("publicNumber= " + common.publicNumber);
        System.out.println("protectedNumber= " + common.protectedNumber);
        System.out.println("defaultNumber= " + common.defaultNumber);
//        System.out.println("privateNumber= " + common.privateNumber);
    }
}
