package academy.lerningprogramming;


public class CompoundAssignmentOperators{
	public static void main(String... args){
		int x = 2;
		int z = 3;
		
		x = x * z; // simple assignment
		x *= z; // shorter form of x = x * z;

		System.out.println("x= " + x);
		
		// int a += 5; // does not compile
		
		// without explicit cast
		long a = 10;
		int b = 4;
		// b = b * a; // does not compile
		// b = (int)(b * a);
		b *= a; // short for of b = (int) (b * a);
		System.out.println("b= " + b);


		long c = 4;
		long d = (c = 2); 
		System.out.println("c= " + c); 
		System.out.println("d= " + d);
		
	}
}