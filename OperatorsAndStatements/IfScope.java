

public class IfScope{
	
	public static void main(String... args){
		/*
		String name = "Lion";
		int score = 100;
		if (name.equals("Lion"))
			score = 200;	

		System.out.println("score= " + score);		
		*/
	
		/*
		String name = "Lion";
		int score = 100;
		if (name.equals("Lion"))
		    score = 200;
		    name = "Larry";
		
		System.out.println("name= " + name + ", score= " + score);
		*/
		
		/*
		String name = "Lion";
		int score = 100;
		if (name.equals("Lion"))
			score = 200;
		name = "Larry";
		else
			score = 129;

		System.out.println("name= " + name + ", score= " + score);
		*/

		/*
		String name = "Lion";
		int score = 100;
		if (name.equals("Lion")) {
			score = 200;
			name = "Larry";
		}
		else score = 129;
		*/

		String name = "Lion";
		if (name.equals("Lion"))
			System.out.println("Lion");
		else
			System.out.println("Not a Lion");
		System.out.println("Again, not a Lion");
	}

}