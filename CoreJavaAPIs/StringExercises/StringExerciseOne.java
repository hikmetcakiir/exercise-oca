
public class StringExerciseOne{
	public static void main(String[] args){
		String value = "Hello";
		String valueTwo = value.concat("World!");
		System.out.println(value+" and "+valueTwo);

		String valueThree = "HelloWorld!";
		System.out.println("Length : "+valueThree.length());
		//System.out.println(valueThree.charAt(11)); //java.lang.StringIndexOutOfBoundsException

		String valueFour = "HelloWorld!";
		//String val = 'a'; // char cannot be converted to String
		String valueFive = valueFour.substring(0,3);
		System.out.println(valueFour);
		System.out.println(valueFive);


		String valueSix = "HelloWorld!";
		String valueSeven = valueSix.toUpperCase();
		System.out.print(valueSix);
		System.out.println(valueSeven);
		
		//toLowerCase();

		//equals() 
		//equalsIgnoreCase()

		//boolean startsWith(String prefix);
		//boolean endsWith(String suffix);

		System.out.println("Hello".startsWith("He"));

		//boolean contains(String str);

		String valueTen = "HelloWorld";
		String valueEleven = valueTen.replace("H","A");
		System.out.println(valueTen);
		System.out.println(valueEleven);

		//String replace(char oldChar,char newChar);
		//String replace(CharSequence oldChar,CharSequence newChar);

		String valueTwelve = "     HelloWorld\ta\t";
		String valueThirteen = valueTwelve.trim();
		System.out.println("Val One : "+valueTwelve);	
		System.out.println("Val Two :"+valueThirteen);	


		//public String trim()

		//Method Chaining
		String start = "AniMaL	";
		String trimmed = start.trim();

		String result = "AniMaL   ".trim().toLowerCase().replace('a','A');
		System.out.print("Result is "+result);


		/*
		1.length()
		2.charAt()
		3.indexOf()
		4.substring()
		5.toLowerCase()
		6.toUpperCase()
		7.equals()
		8.equalsIgnoreCase()
		9.startsWith()
		10.endsWith()
		11.contains()
		12.replace()
		13.trim()
		14.Method Chaining
		*/

		/* 
		The Method Signatures
		
		1.int length()

		2.char charAt(int index)

		3.int indexOf(char ch)
		3.int indexOf(char ch,indexFromIndex)
		3.int indexOf(String str)
		3.int indexOf(String str,index fromIndex)

		4.String substring(int beginIndex)
		4.String substring(int beginIndex,int endIndex)

		5.String toLowerCase(String str)
		6.String toUpperCase(String str)


		7.boolean equals(String str)
		8.boolean equals(String str)

		9.boolean startsWith(String prefix)
		10.boolean endsWith(String suffix)

		11.boolean contains(String str)

		12.String replace(char oldChar,char newChar)
		12.String replace(charSequence oldChar, CharSequence newChar)

		13.public String trim()			

		*/
	}
}