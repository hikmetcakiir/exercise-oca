package com.hikmetcakir.package9;

/**
 *
 */
public class MethodDesign {

    public void jump() {}

//    void public jump2(){} // DOES NOT COMPILE

    void jump3() {
    }

    public final void jump4() {}

    public static final void jump5() {}

    public final static void jump6() {}

//    public modifier void jump7() {} // DOES NOT COMPILE modifier is not specifier

//    public String void jump8() {}

    final public void jump9 () {}

    final static public void jump10() {}

//    String int public void jump11() {} // DOES NOT COMPILE



}
