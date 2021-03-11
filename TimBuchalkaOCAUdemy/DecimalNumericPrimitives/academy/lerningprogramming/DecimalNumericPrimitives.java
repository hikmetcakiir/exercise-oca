package academy.lerningprogramming;


public class DecimalNumericPrimitives{
	public static void main(String... args){
		float myNumber = 4; // Is Ok
		//float myNumber = 4.3; // DOES NOT COMPILE
		float myNumber2 = 4.3f;  // Is Ok
		
		//double before = 10_.25; // DOES NOT COMPILE
		//double after = 10._25; // DOES NOT COMPILE
		//double first = _10.25; // DOES NOT COMPILE
		//double last = 10.25_; // DOES NOT COMPILE

		double myDouble = 2.54;
		double myDouble2 = 2.54F;
		double anotherDouble = 2.45d; // 2.45D;
		double scientific = 5.000125E03; // or e // 5.000125 10^3
		double scientific2 = 5.000125E3;
		double myDouble3 = 5000.125; 

		System.out.println("scientific= " + scientific);
		System.out.println("scientific2= " + scientific2);
		System.out.println("myDouble3= " + myDouble3);

		double hexPi = 0x1.91eb851eb851fp1; //hexadecimal floating - point literal, letter P
		// p indicates hexadecimal floating point number
		System.out.println("hexPi= " + hexPi);
	}

}