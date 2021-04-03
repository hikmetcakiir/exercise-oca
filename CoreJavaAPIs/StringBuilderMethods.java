

public class StringBuilderMethods {

	public static void main(String... args) {
		// String methods
		// indexOf, substring, charAt, toLowerCase, toUpperCase, replace
		// length(), contains, concat

		/*
		String a = new String("a");
		a = a.concat("b");	
		System.out.println(a);
		System.out.println(a.contains("b"));
		*/

		//Important StringBuilder methods
		// charAt(), indexOf(), length(), substring()
		// append(), insert(), delete(), deleteCharAt()
		// reverse(), toString()
	
		// charAt, indexOf, length, substring
		// 0 1 2 3 4 5 6 7 9 9 10
		// p r o g r a m m i n g
		StringBuilder sb = new StringBuilder("programming");
		// g r a m
		String sub = sb.substring(sb.indexOf("g"), sb.indexOf("mi"));
		
		int len = sb.length(); // 11
		char ch = sb.charAt(5); // a
		System.out.println(sub + " " + len + " " + ch);

		// append
		StringBuilder b = new StringBuilder().append(1).append("L");
		b.append("-").append(true);
		System.out.println(b);

		StringBuilder builder = new StringBuilder("programming");
		builder.insert(7, "-");
		builder.insert(2, 2);
		System.out.println(builder);

		// delete, deleteCharAt
		builder.delete(4, 9);
		System.out.println(builder);
		builder.deleteCharAt(2);
		System.out.println(builder);

		//builder.delete(2,1); // java.lang.StringIndexOutOfBoundsException
		builder.substring(0,4);
		System.out.println(builder);

		System.out.println("*******************");

		StringBuilder sb1 = new StringBuilder("ABC123");
		sb1.reverse().reverse();
		System.out.println(sb1);
		
		String myString = sb1.toString();
		myString = myString.toLowerCase();		
		System.out.println(myString);
	}
}