package com.hikmetcakir.practice16;



interface C  {
     void A();
}

class D implements C {
    final static int x;
    final int y;
    static{
        x = 5;
//        y=5;
    }

    {
//        x = 6;
//        y= 6;
    }

    public D() {
//        x = 4;
        y = 6;
    }

    public static void main(String[] args) {
        int[] a []= new int[3][];

        Float i = new Float("2.4");
        System.out.println(i);
        Short s = new Short(null);
//        Character c = new Character(null);
        System.out.println(s);
        StringBuilder sb = new StringBuilder("hi");

        int[] val = {2,3,4,5};
        int[] val2[] = new int[][] {{2,4},{2,4,5}};
        int[] val3[] = new int[4][3];
        int[] val4[] = {{2,3,4,5,6,8,9}};

//        int[][] val5 = new int[][];
    }

    @Override
    public void A() {

    }
}























public class A {

    public static void main(String[] args) {

    }
}
