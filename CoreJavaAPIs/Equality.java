
public class Equality {

	public static void main(String... args) {
		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		StringBuilder three = one.append("Java");
		
		System.out.println(one == two); // false
		System.out.println(one == three); // true

		String x = "Java";
		String y = "Java";
		
		System.out.println(x == y);
		
		String a = "Java";
		String b = " Java".trim();
	
		System.out.println(a == b); // false
		

		StringBuilder sb = new StringBuilder(" Java");
		//sb.trim(); // DOES NOT COMPILE // Cannot find symbol

		String c = "Java";
		String d = " Ja".trim() + "va";

		System.out.println(c == d);

		String f = "Java";
		String g = "Ja" + "va";
		System.out.println( f == g );


		StringBuilder sb1 = new StringBuilder("Hello");
		StringBuilder sb2 = new StringBuilder("Hello");
		if(sb1.toString().equals(sb2.toString()))
			System.out.println("StringBuilders are Equals");
	}

}