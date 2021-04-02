

public class StringMethods {

	public static void main(String... args) {
		// 1 2 3 4 5 6 7  8 9 10 
		// j a v a   i s  f u n
		String str = "java is fun";
		
		// length
		System.out.println("length= " + str.length());	
		
		// char at
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(6));
		//System.out.println(str.charAt(12));

		// index of
		System.out.println(str.indexOf('a'));  // 1
		System.out.println(str.indexOf('a',1)); // 1
		System.out.println(str.indexOf('a',2)); // 3
		System.out.println(str.indexOf("fun", 9)); // - match not found

		System.out.println("**********************");

		// substring
		//str = str.substring(8);
		System.out.println(str.substring(8));
		System.out.println(str.substring(0, 5));
		System.out.println(str.substring(4, 4));
		System.out.println(str.substring(11, 11));
		//System.out.println(str.substring(12, 12)); // Throw Exception

		//System.out.println(str.substring(4, 2));
		//System.out.println(str.substring(8, 14)); // StringIndexOutOfBoundsException

		System.out.println("**************************");
		System.out.println("AbCd".toLowerCase());
		System.out.println(str);

		String dog = "Lucky";
		// dog.toUpperCase();
		dog = dog.toUpperCase();
		System.out.println(dog);
	}
}