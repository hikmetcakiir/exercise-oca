package com.hikmetcakir.package5;

public abstract interface B extends A{
    public static final int B = 4;

    public abstract void print(int information);

    public default int takeArg() {
        return 2;
    }

}
