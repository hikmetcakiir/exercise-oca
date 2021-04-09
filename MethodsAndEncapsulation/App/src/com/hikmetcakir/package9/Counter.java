package com.hikmetcakir.package9;

public class Counter {
    public static int count;

    public int anotherCount;

    Counter() {
        count++;
        anotherCount++;
    }

    public static void main(String[] args) {
        Counter one = new Counter();
        Counter two = new Counter();
        Counter three = new Counter();
        Counter four = new Counter();

        System.out.println(count);
        System.out.println(one.count);
        System.out.println(three.count);
        System.out.println(four.count);

        count++;

        System.out.println(count);
        System.out.println(one.count);
        System.out.println(three.count);
        System.out.println(four.count);

        one.anotherCount = 2;
        two.anotherCount = 3;
        three.anotherCount = 4;
        four.anotherCount = 5;
    }
}
