package root;

import static java.lang.System.out; 

public class Main{
	
	public static void main(String... args){ 	
		//Integer x1 = Integer.parseInt("4");
		//Integer y1 = Integer.parseInt("4");
		Integer x2 = Integer.parseInt("444");
		Integer y2 = Integer.parseInt("444");

		//System.out.println(x1==y1); // true
		System.out.println(x2==y2); // false ???

		Integer a1 = Integer.valueOf("4");
		Integer b1 = Integer.valueOf("4");
		Integer a2 = Integer.valueOf("444");
		Integer b2 = Integer.valueOf("444");

		System.out.println(a1==b1); // true
		System.out.println(a2==b2); // false	

		System.out.println("************");
     		Integer b3=127;
        	Integer b4=127;
        	System.out.println(b3==b4);
        	System.out.println(b3.equals(b4));
	}

}