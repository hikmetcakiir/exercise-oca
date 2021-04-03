

public class ContinueStatements {

	public static void main(String... args) {
		String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};
		
		for(String animal : animals) {
			System.out.println(animal);
		}

		System.out.println("******************");

		MY_LOOP:
		for(String animal : animals) {
			if(animal.equals("Cat")) {
				continue MY_LOOP;
			}

			System.out.println(animal);
		}

		animal:
		for(String animal : animals) {
			if(animal.equals("Cat")) {
				continue animal;
			}
			
			System.out.println(animal);
		}
	
		System.out.println("*****************");
	
		for(String animal : animals) {
			if(animal.equals("Lizard") || animal.equals("Cat")) {
				continue;
			}	
		
			System.out.println(animal);
		} 

		int index = 0;
		while (index < animals.length) {
			//index++; // java.lang.ArrayIndexOutOfBoundsException : 5
			String animal = animals[index];
			index++;
			if(animal.equals("Lizard")) {
				continue;
			}
		
			System.out.println(animal);
			//index++;
		}

		String val = "Hello World!";
		if(val.equals(null));
	}

}