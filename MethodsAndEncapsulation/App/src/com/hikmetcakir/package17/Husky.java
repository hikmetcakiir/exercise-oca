package com.hikmetcakir.package17;

public class  Husky extends Dog implements HasTail {

    public Husky(int age) {
        super(age);
        System.out.println("Husky");
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("husky eating");

        super.eat();
    }
}
