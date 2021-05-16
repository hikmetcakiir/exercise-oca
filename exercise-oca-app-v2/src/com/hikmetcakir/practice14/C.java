package com.hikmetcakir.practice14;

public interface C extends A, B {

    @Override
    default int method1() {
        return 0;
    }
}
