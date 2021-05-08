package com.hikmetcakir.practice1;

import java.util.Arrays;

 class C {

    static int[] a1 = new int[5];
    public static void main(String[] args) {
        int[] a2 = new int[5];
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

//        String a_b;
//        System.out.println(a_b);

	if(true){
		System.out.println("Hello World");
	}
	
	System.out.println('c' + 2);

	String al = "lion";
	//System.out.println(al.substring(-4));
	System.out.println(al.charAt(3));
	int[] ar[] = new int[5][];

	StringBuilder sb = new StringBuilder("grafy");
	System.out.println(sb.delete(0,sb.length()-1));
    }
}
