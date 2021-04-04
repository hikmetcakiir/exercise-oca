
import java.util.*;

public class ArrayListMethods2 {

	public static void main(String... args) {
		//isEmpty(),size()
		//clear()
		//contains()
		//equals()
		List<String> pets = new ArrayList<>();
		
		System.out.println(pets.isEmpty());
		System.out.println(pets.size());

		if(pets.isEmpty()){
			System.out.println("no pets");
		}			
		
		if(pets.size() == 0) {
  			System.out.println("no pets");
		}

		pets.add("cat");
		System.out.println(pets.isEmpty());
		System.out.println(pets.size());

		pets.clear();

		System.out.println(pets.isEmpty());
		System.out.println(pets.size());
		System.out.println(pets.contains("dog"));

		List<String> newPets = new ArrayList<>();
		newPets.add("dog");
		
		System.out.println("*****************************");
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();

		list1.add("cat");
		list2.add("cat");
		list1.add("dog");
		list2.add("dog");
		if(list1.equals(list2)){
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}

		pets.add(0, "cat");
		System.out.println(newPets);
		
		System.out.println(pets.equals(newPets));
	}
}