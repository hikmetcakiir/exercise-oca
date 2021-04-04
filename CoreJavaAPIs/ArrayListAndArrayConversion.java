
import java.util.*;

public class ArrayListAndArrayConversion {


	public static void main(String... args) {
		List<String> names = new ArrayList<>();
		names.add("Tony");
		names.add("Jimmy");
		names.add("Anthony");
		
		Object[] namesArray = names.toArray();
		System.out.println(namesArray.length);
		
		

		String[] stringArray = names.toArray(new String[0]);
		System.out.println(stringArray.length);

		String[] anotherStringArray = names.toArray(new String[names.size()]);
		System.out.println(anotherStringArray.length);

		String[] petsArray = {"dog","cat","parrot"};
		List<String> petsList = Arrays.asList(petsArray);
		
		List<String> list = Arrays.asList("dog", "cat", "parrot");
		list.add("four");
	}

}