 
public class StringExercises{
	public static void main(String... $n){
		String name = "Hikmet Cakir";
		String nameTwo = "Hikmet Cakir";
		String nameWithNew = new String("Hikmet Cakir");
		

		if(name == nameWithNew){
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}

		if(name == nameTwo){
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}

		if(name.equals(nameWithNew)){
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}

		int numberOne = 1;
		int numberTwo = 2;
		String numberThree = "3";
		System.out.println(numberOne+numberTwo+numberThree);


		String valueOne = "Hello";
		String valueTwo = valueOne.concat("World!");
		System.out.println("Value : "+valueTwo);
		
		String location = "Turkey Republic";
		System.out.println(location.toString()); // is a String but not a literal

		String company = "MyCompany";
		System.out.println("MyCompany length is "+company.length());

		System.out.println("MyCompany second 2. index is "+company.charAt(2));
		System.out.println("MyCompany second 4. index is "+company.charAt(4));

		System.out.println("MyCompany y index value is "+company.indexOf('y'));
		System.out.println("MyCompany y index value from then 13's index is "+company.indexOf('y',13));
		System.out.println("MyCompany om index value from then 4's index is "+company.indexOf("om",4));

		String valueSix = "HelloWorld!";
		System.out.println("substring value 1 is "+valueSix.substring(2,2)); //empty
		System.out.println("substring value 1 is "+valueSix.substring(2,3)); 
		System.out.println("substring value is "+valueSix.substring(1));
		System.out.println("substring value is "+valueSix.substring(valueSix.length())); // empty
		//System.out.println("substring value is "+valueSix.substring(-1,2)); //java.lang.StringIndexOutOfBoundsException: String index out of range: -1
		//System.out.println("substring value is "+valueSix.substring(3,2)); //java.lang.StringIndexOutOfBoundsException: String index out of range: -1
	
		String valueSeven = "HelloWorld!";
		System.out.println("valueSeven "+valueSeven);
		valueSeven = "Hello";
		System.out.println("valueSix "+valueSix);
		System.out.println("valueSeven "+valueSeven);

		String animal = "animal";
		System.out.println("animal upper case form is "+animal.toUpperCase());
		System.out.println("animal is "+animal);
		System.out.println("animal lower case form is "+animal.toLowerCase());

		System.out.println("ABC".equals("abc"));
		System.out.println("ABC".equals("ABC"));

		System.out.println("ABC".equalsIgnoreCase("Abc"));
		System.out.println("ABC".equalsIgnoreCase("Abc "));

		String compareValue = "Compare";
		//System.out.println("Result "+compareValue.contains('o')); //Compile Error! char cannot be converted to CharSequence
		System.out.println("Result "+compareValue.contains("om"));

		String compareValueTwo = "CompareTwo";
		//System.out.println("Result Two is "+compareValueTwo.startsWith('C')); //Compile Error! char cannot be converted to String
		System.out.println("Result Two is "+compareValueTwo.startsWith("C"));
		System.out.println("Result Two is "+compareValueTwo.endsWith("o"));
		System.out.println("Result Two is "+compareValueTwo.endsWith("O"));

		System.out.println("ABC".replace("A","a"));
		System.out.println("ABC".replace('B','b'));
		//System.out.println("ABC".replace("B",'b')); // no suitable method found for replace


		String stringWithTrim = new String("\n\nVAL\tU E\t\t");
		System.out.println("The value is : "+stringWithTrim.trim());

		System.out.println("Result is "+stringWithTrim.trim().toLowerCase().replace("va","VA"));
	}
}