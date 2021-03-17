

public class Figure52{
	
	public static void main(String... args){
		int score = 100;
		String result = "";
		String name = "Lion";
		java.io.File file = new java.io.File("F");

		// if
		if(name.equals("Lion"))
			score = 200;
	
		// if-else
		if(name.equals("Lion"))
			score = 200;
		else
			score = 300;
		
		// if-else-if-else
		if( score == 100)
			result = "A";
		else if( score == 50)
			result = "B";
		else if( score == 10 )
			result = "C";
		else
			result = "F";
		
		
	}

}