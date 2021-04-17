package com.hikmetcakir.package17;

public class Rabbit extends Animal implements Herbivore {

    public Rabbit() {
//        super.eat();
//        super().setAge(3);
        super();
//        super.age = 5;
//        this.age = 6;
//        age = 6;
    }

    @Override
    public int getWeight() {
        return 0;
    }

    public Rabbit(int age) {
//        super();

        this();
        age = 5;
    }

    @Override
    public void eatPlants() {

    }
}
