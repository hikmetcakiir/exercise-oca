package com.hikmetcakir.practice8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

class Super {
    static String ID = "QBANK";
}

class Sub extends Super {
    static {
        System.out.print("In Sub");
    }
}

class XXX {
    public void m() {
        throw new RuntimeException();
    }
}

class YYY extends XXX {
    public void m()  {
    }
}

public class Test {
    public static void main(String[] args) {
        Sub sub = new Sub();
        XXX x = new XXX();
        System.out.println(LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));
    }
}