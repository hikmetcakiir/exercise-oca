package com.hikmetcakir.practice14;

public interface A {
    int a = 4;
    default int method1() {
        return 2;
    }
}
