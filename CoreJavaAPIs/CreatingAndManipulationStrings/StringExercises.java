 
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


	}
}