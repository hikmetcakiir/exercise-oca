

import java.util.*;

public class ArrayListMethods {

	public static void main(String args[]) {
		//List list = new ArrayList();
		List<Object> list = new ArrayList<>();
		list.add("dog");
		list.add(5);

		System.out.println(list); // print ln toString() methods auto add
		
		List<String> pets = new ArrayList<>();
		//pets.add(3); // DOES NOT COMPILE
		pets.add("dog");
		System.out.println(pets);

		pets.add(0,"cat");
		System.out.println(pets);

		pets.add("parrot");		
		System.out.println(pets);

		pets.add(3,"parrot2");		
		System.out.println(pets);

		//pets.add(10,"lion");	// DOES NOT COMPILE	
		System.out.println(pets);

		System.out.println("*******************");

		char b = 'a';
		//String cb = (String)(b); // DOES NOT COMPILE
		//pets.add(b);  // DOES NOT COMPILE
		System.out.println(pets);
		pets.add(1,"koala");
		System.out.println(pets);
		pets.add(0,"Elephant");
		System.out.println(pets);
		
		pets.add(1,"husky");

		System.out.println("*************");
		
		List<String> forest = new ArrayList<>();
		forest.add("tree");
		System.out.println(forest);
		forest.add("bear");
		System.out.println(forest);
		forest.add("birds");
		System.out.println(forest);
		forest.add(3,"river");
		System.out.println(forest);

		// remove
		forest.remove("river");
		System.out.println(forest);
		
		forest.remove(2);
		System.out.println(forest);
		//forest.remove(20);
		//System.out.println(forest);


		forest.set(0, "newBird");
		System.out.println(forest);

		System.out.println("********************");
		List<String> library = new ArrayList<>();
		library.add("book");
		library.add("roof");
		library.add("pencil");
		library.remove(2);
		//library.remove(5); 
		library.set(10,"lamb");
		System.out.println(library);		
		System.out.println("*******************");

			
	}


}