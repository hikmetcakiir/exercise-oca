package academy.learningprogramming;


public class WholeNumericPrimitives{
	
	public static void main(String... args){
		// When your see number in code that number is called "literal"
		//long max = 32123456789; // DOES NOT COMPILE ( Integer number too large )
		long max = 32_123_456_789L; // 32123456789l;
		//float min = 2.3; // DOES NOT COMPILE		
		long n = 2_300;

		// octal (0-7)
		//int oct = 08; // DOES NOT COMPILE; 
		int oct = 07123123;
		System.out.println(oct); // 1877587
		int firstOct = 010; // 8 decimal
		int secondOct = 022; // 18 decimal
		
		int firstOct2 = 010; // 8 decimal
		int secondOct2 = 022; // 18 decimal
		int sumOct = firstOct2 + secondOct2;
		System.out.println(sumOct + "," + Integer.toOctalString(sumOct)); // 26 decimal

		// hexadecimal (0-9 and A-F)
		int firstHex = 0xF; //15 decimal
		int secondHex = 0x1E; // 30 decimal
		System.out.println(firstHex + secondHex); // 45 decimal
		System.out.println(Integer.toHexString(firstHex + secondHex)); 
		//int value = Integer.toHexString(firstHex + secondHex); // DOES NOT COMPILE
		

		// binary
		int firstBin = 0b1001; // 9 decimal
		int secondBin = 0b0111; // 7 decimal
		int sumBin = firstBin + secondBin;
		System.out.println(firstBin + secondBin);
		System.out.println(Integer.toBinaryString(firstBin+secondBin));
	}

}