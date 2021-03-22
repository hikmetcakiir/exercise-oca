package Operators.ConditionalOperators;


public class ConditionalOperators {
	
	public static void main(String... args) {
		//Conditional(short-circuit logical) operators(&&, ||)
		boolean a = true;
		boolean b = false;
		boolean c = true;
		boolean d = a && b;
		boolean e = a || b; // true

		System.out.println("d= " + d + ", e= " + e); // false

		int f = 4;
		boolean g = false && (f++ < 4); // (f++ < 4) is never executed  (short-circuting)
		boolean h = (f-- == 4) && !g;
		// true && true -> true		
	
		System.out.println("g= " + g + ", h= " + h);
		System.out.println("f= " + f);
		
		int myInt = 3;
		int anotherInt = 4;
		boolean myBoolean = (myInt <= 3) && (anotherInt-- == 4) || (myInt++ == 4);	
		// (myInt <= 3) -> true
		// (anotherInt-- == 4) -> true, anotherInt = 3
		// 
		
		System.out.println("myInt= " + myInt);
		System.out.println("anotherInt= " + anotherInt);
		System.out.println("myBoolean= " + myBoolean);

		boolean x = true, z = false;
		int y = 20;
		x = (y != 10) ^ (z = false);
		// x = true ^ false
		// x = true

		System.out.println(x + ", " + y + ", " + z);				
	}

}