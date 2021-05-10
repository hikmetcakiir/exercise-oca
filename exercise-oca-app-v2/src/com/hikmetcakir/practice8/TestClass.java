package com.hikmetcakir.practice8;

//in file A.java
 class A {
    protected void m()  {
        System.out.println("A's m's method");
    }
}

//in file B.java
 class B extends A {
    public void m() {
        System.out.println("B's m's method");
    }
}
class D {

}
//in file TestClass.java
public class TestClass {
    public static void main(String[] args) {
        A a = new A();
        D d = new D();
        B b = new B();

//        d = (D)a;

        a.m();
    }


}
