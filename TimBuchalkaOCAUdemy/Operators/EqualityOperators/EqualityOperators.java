package Operators.EqualityOperators;


public class EqualityOperators {

	public static void main(String... args) {
		/*
		int a = 5;
		int b = 3;
		boolean c = a == b; // false
		boolean d = a != b; // true
		
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		System.out.println("c= " + c);
		System.out.println("d= " + d);

		// boolean g = true == 0; // DOES NOT COMPILE			
		//boolean h = false != "test"; // DOES NOT COMPILE
		boolean k = "Test" == "Test"; // true
		System.out.println("k= " + k);

		boolean x = true;
		boolean y = false;
		boolean z = (y = true) && (x = false);
		
		System.out.println(x + ", " + y + ", " + z);
		*/

		// comparing objects
		Integer myInteger = 127;
		Integer myAnotherInteger = 127;

		System.out.println(myInteger == myAnotherInteger);

		System.out.println("*********************");

		myInteger = 128;
		myAnotherInteger = 126;
		myInteger = 126;
		System.out.println(myInteger == myAnotherInteger);

		// myInteger = 128;
		Integer.valueOf(128);
		
		Integer int1 = new Integer(1);
		Integer int2 = new Integer(2);
		Integer int3 = 1;
		Integer int4 = 1;
		Integer int5 = Integer.parseInt("1");

		System.out.println("*********************");
		System.out.println(int1 == int2);
		System.out.println(int2 == int3);
		System.out.println(int3 == int4);
		System.out.println(int3 == int5);

		System.out.println("int1 hash= "+ System.identityHashCode(int1));
		System.out.println("int2 hash= "+ System.identityHashCode(int2));
	} 

}