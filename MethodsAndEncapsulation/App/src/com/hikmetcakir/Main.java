package com.hikmetcakir;

import com.hikmetcakir.package3.Access4;
import com.hikmetcakir.pets.Lion;
import com.hikmetcakir.staticex.Book;

public class Main {

    public static void main(String[] args) {
//        Book b = new Book();
//        System.out.println("PageNumber access from instance= " + b.pageNumber);
//        System.out.println("PageNumber= " + Book.pageNumber);
//        b = null;
//        System.out.println("PageNumber= " + Book.pageNumber);
//
//        System.out.println("*********************************");
//        Book.print();
//        b.print();
        first();
        second();
//        third();
    }

    private String name = "Static class";
    public static void first() { }
    public static void second() { }
    public void third() {
        System.out.println(name);
    }



}
