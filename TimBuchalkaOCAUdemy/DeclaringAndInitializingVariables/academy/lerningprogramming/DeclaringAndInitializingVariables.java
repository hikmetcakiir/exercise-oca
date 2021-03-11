package academy.lerningprogramming;


public class DeclaringAndInitializingVariables{
	
	public static void main(String... args){
		// declaring and initializing in two lines
		int myNumber;
		//System.out.println("myNumber= " + myNumber);
		myNumber = 10;
		System.out.println("myNumber= " + myNumber);
	
		// one line
		double myDouble = 7.50;
		System.out.println("myDouble= " + myDouble);
		
		float myFloat, myFloat2, myFloat3;
		float myFloat4; float myFloat5;
		
		float myFloat6 = 5f, myFloat7 = 10f, myFloat8;
		boolean b1, b2;
		
		//double d1, double d2; // DOES NOT COMPILE
		
		int i1;
		int i2;
		//int i3; i4; // DOES NOT COMPILE
		
		char cHaR;
		char Char;
		
		float okFloat;
		double $Ok2Double1;
		double _alsoDouble;
		flaot __OkButNotNice$_123;

		// illegal examples
		//double 3Dpoint;
		//double my@stree;
		//float *$coffee;
		//float double;
	}
}