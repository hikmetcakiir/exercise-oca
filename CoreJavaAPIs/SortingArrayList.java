
import java.util.*;

public class SortingArrayList {

	public static void main(String... args) {
		List<String> numsList = Arrays.asList("500", "10", "9", "50", "40", "abc", "zbc", "ab1","bs");
		System.out.println(numsList);
		Collections.sort(numsList);
		System.out.println(numsList);

		List<Integer> numbers = Arrays.asList(16, 32, 43, 14, 25);
		Collections.sort(numbers);	
		System.out.println(numbers);
		
	}

}