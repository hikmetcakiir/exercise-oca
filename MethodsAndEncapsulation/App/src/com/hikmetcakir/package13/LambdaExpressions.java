package com.hikmetcakir.package13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Animal {
    private String type;
    private boolean canJump;
    private boolean canSwim;

    public Animal(String type, boolean canJump, boolean canSwim) {
        this.type = type;
        this.canJump = canJump;
        this.canSwim = canSwim;
    }

    public boolean isCanJump() {
        return canJump;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public String getType() {
        return type;
    }
}

interface CheckAnimal{
    boolean check(Animal animal);

}


class CheckCanJump implements CheckAnimal{

    @Override
    public boolean check(Animal animal) {
        return animal.isCanJump();
    }

}

interface AnotherCheck {
    boolean check(Animal first, Animal second);


}
public class LambdaExpressions {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false,true));
        animals.add(new Animal("rabbit", true,false));
        animals.add(new Animal("dog", true,true));

//        print(animals, new CheckCanJump());

        print(animals,animal -> animal.isCanSwim());
        print(animals,animal -> !animal.isCanSwim());

        print(animals, (Animal animal) -> {
//            Animal animal = new Animal("cat",true,false);
            System.out.println("checking animal=" + animal.getType());
            return animal.isCanJump();
        });

        print(animals, (Animal animal) ->{ return animal.isCanJump(); });

        Animal fish = animals.get(0);
        Animal rabbit = animals.get(1);
        Animal dog = animals.get(1);

        print(fish,rabbit, (first, second) -> first.isCanSwim() && second.isCanJump());
        print(fish, dog, (first, second) -> first.isCanSwim() && second.isCanJump());


        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Anthony");
        names.add("Jimmy");
        names.add("Timmy");

        System.out.println("names= " + names);

        names.removeIf(name -> name.charAt(0) == 'J');


        System.out.println("after names= " + names);

    }

    private static void print(Animal first, Animal second, AnotherCheck check) {
        System.out.println(check.check(first, second));
    }

//    private static void print(List<Animal> animals, CheckAnimal filter) {
//        for(Animal animal : animals) {
//            if(filter.check(animal)) {
//                System.out.println(animal.getType());
//            }
//        }
//
//        System.out.println();
//    }
    private static void print(List<Animal> animals, Predicate<Animal> filter) {
        for(Animal animal : animals) {
            if(filter.test(animal)) {
                System.out.println(animal.getType());
            }
        }

        System.out.println();
    }
}
