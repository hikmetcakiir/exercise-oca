

public class StringClass2 {
	
	public static void main(String... args) {
		/*
		String str1 = new String("Hello World");
		String str2 = "Hello World";

		if(str1 == str2) {
			System.out.println("Equal");	
		}
		*/

		/*
		// String morning = "Morning"; // OUTPUT : Morning
		String morning = new String("Morning");
		if("Morning" == morning) {
			System.out.println(morning);
		}
		*/
	
		/*
		String girl = new String("Shreya");
		char[] name = new char[] {'P', 'a', 'u', '1'};
		String boy = new String(name);
		
		System.out.println("boy= " + boy);
		*/

		/*
		StringBuilder sd1 = new StringBuilder("String Builder");
		String str5 = new String(sd1);
		StringBuffer sb2 = new StringBuffer("String Buffer");
		String str6 = new String(sb2);

		System.out.println("str5= " + str5);
		System.out.println("str6= " + str6);
		*/

		/*
		String str1 = "Autumn";
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(5));
		System.out.println(str1.charAt(6));
		*/

		String letters = "ABCAB";
		//System.out.println(letters.indexOf('A'));
		//System.out.println(letters.indexOf('B'));
		//System.out.println(letters.indexOf('C'));

		System.out.println("*************************");

		//System.out.println(letters.indexOf("C"));
		//System.out.println(letters.indexOf("B"));
		//System.out.println(letters.indexOf("AB"));

		System.out.println("*************************");

		//System.out.println(letters.indexOf("bc"));
		//System.out.println(letters.indexOf('A'));
		//System.out.println(letters.indexOf("AB"));

		System.out.println("*************************");
		
		//System.out.println("ABCDEFGH".substring(9,4));

		System.out.println("*************************");
		//String str1 = "\nABCDEF\n";
		//System.out.println(str1.trim());

		System.out.println("*************************");
		String letters1 = "ABCDEF";
		System.out.println(letters1.replace("AB","CD"));
		System.out.println(letters1.replace("AB","CD"));
		System.out.println(letters1.replace("AB","CD"));

		System.out.println("*************************");
		
		System.out.println("DEF"+"ABC".length());

		System.out.println("*************************");
		String str13 = "ABCADEF";
		System.out.println(str13.startsWith("A"));			
		//System.out.println(str13.startsWith('A')); // DOES NOT COMPILE			
		System.out.println(str13.startsWith("A",3));

		System.out.println("*************************");
		String str14 = "ABCADEF";
		System.out.println(str14.endsWith("F"));			
		//System.out.println(str14.endsWith('A')); // DOES NOT COMPILE			
		System.out.println(str14.endsWith("DEF"));
	}

}