package com.hikmetcakir.package17;

public interface HasTail extends CanSwim,CanRun{
//    public static final int DEFAULT_TAIL_LENGTH = 2;
    int DEFAULT_TAIL_LENGTH = 2;

//    public int getTailLength();

    // the interface methods always assumed public abstract!!!

    // the interface variables always assument public static final!
//    public abstract int getDefaultTailLength();

    int getTailLength();

    int getWeight();
}
