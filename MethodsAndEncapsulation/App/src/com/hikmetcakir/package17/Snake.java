package com.hikmetcakir.package17;

public class Snake extends Reptile{

    @Override
    protected boolean hasLegs() {
        return false;
    }

    @Override
    public double getWeight() {
        return 10;
    }
}
