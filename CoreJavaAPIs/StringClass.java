package CoreJavaAPIs;


public class StringClass {
	
	public final static void main(String... args) {
		String name = "Fluffy";
		String name2 = new String("Fluffy");
		System.out.println(name);
		System.out.println(name2);
		
		//String name3 = new String(1);
		//System.out.println(name3);

		String val1 = "1";
		val1 = val1.concat("2");
		val1.concat("3");
		System.out.println(val1);

		String value = "Lion";
		System.out.println("Length : " + value.length());
		System.out.println("1. Index : " + value.charAt(1));
		System.out.println("3. Index : " + value.charAt(3));
		System.out.println("0. Index : " + value.charAt(0));

		//System.out.println("0. Index : " + value.charAt(4));

		System.out.println();		

		System.out.println(value.indexOf('L',0));
		System.out.println(value.indexOf("o",0));
		System.out.println(value.indexOf("2",5));
	
		System.out.println("*************************");
		
		/*
		String value2 = "Primate";
		//String cutString = value2.substring(0,8);
		value2.substring(0,1);
		System.out.println(value.substring(6,6));
		*/


		String x = "Lion";
		//x.substring(5,5);
		//x.substring(3,7);

		System.out.println("*******************************");
	
		StringBuilder sb = new StringBuilder("Kangaroo");
		//StringBuilder sb2 = "Hello";
		String sb3 = sb.substring(0,3);
		System.out.println(sb3);
		
	}

}