package com.hikmetcakir.practice6;

import java.sql.SQLException;

public class A {
    public static void main(String args[]) {

        try {
            m1();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("1");
            System.exit(2);
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("2");
            return;
        } catch (Exception e) {
            System.out.println("3");
        } finally {
            System.out.println("4");
        }
        System.out.println("END");
    }

    static void m1() {
        System.out.println("m1 Starts");
        throw new IndexOutOfBoundsException("Big Bang ");
    }
}
