
import java.util.*;

public class IterationList1 {
	
	public static void main(String... args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(2);
		numbers.add(4);
		numbers.add(6);
		
		for(int i = 0; i < numbers.size(); i++) {
			System.out.println("element at index " + i + " is " + numbers.get(i));
			//numbers.remove(2);
			numbers.remove(i);
		}

		for(Integer number : numbers) {
			//numbers.add(2);
		}

		for(Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext(); ) {
			Integer number = iterator.next();
			System.out.println(number);
			iterator.remove();
		}

		numbers.addAll(4,3);
	}

}