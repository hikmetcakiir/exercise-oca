package com.hikmetcakir.practice15;

import java.util.*;

public class A {

    public static void main(String[] args) {
        List<String> dryFruits = new ArrayList<>();
        dryFruits.add("Walnut");
        dryFruits.add("Apricot");
        dryFruits.add("Almond");
        dryFruits.add("Date");

//        ListIterator<String> iterator = dryFruits.listIterator();
//        while(iterator.hasNext()) {
//            if(iterator.next().startsWith("A")) {
//                iterator.remove();
//            }
//        }
//

//        for(int i = 0; i < dryFruits.size(); i++) {
//            if(dryFruits.get(i).startsWith("A")) {
//                dryFruits.remove(i);
//            }
//        }
        // OUTPUT : [Walnut, Almond, Date]

//        for(String dryFruit : dryFruits) {
//            if(dryFruit.startsWith("A")) {
//                dryFruits.remove(dryFruit);
//            }
//        }
        // OUTPUT : EXCEPTION (java.util.ConcurrentModificationExceptio)

        Iterator<String> iterator = dryFruits.iterator();
        while(iterator.hasNext()) {
            if(iterator.next().startsWith("A")) {
                iterator.remove();
            }
        }
        // [Walnut, Date]

        Collection cdd = new ArrayList();

        System.out.println(dryFruits);
    }

}
