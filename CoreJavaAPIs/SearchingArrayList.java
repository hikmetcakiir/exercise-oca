
import java.util.*;

public class SearchingArrayList {


	public static void main(String... args) {
		List<String> numsList = new ArrayList<>();
		numsList.add("500");
		numsList.add("10");
		numsList.add("9");
		numsList.add("50");
		numsList.add("40");

		System.out.println(numsList);

		int index = Collections.binarySearch(numsList,"10");
		System.out.println(index);
	}

}