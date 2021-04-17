package com.hikmetcakir.package17;

public interface Herbivore {

    default void eatPlants() {
        System.out.println("Eating meat");
    }

//    default int getRequiredPlantAmount() {
//    }

//    public int getRequeredPlanAmount(){
//        return 2;
//    }


}
