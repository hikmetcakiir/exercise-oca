
import java.util.*;

public class Test {

	public static void main(String... args) {
		List<Long> list1 = Arrays.asList(4L,5L,6L,7L,8L,2L,4L,5L,5L,3L,3L,2L,8L);
		Collections.sort(list1);		
		int l = list1.indexOf(2L);
		System.out.println("l= " + l);
		System.out.println("list1= " + list1);
	}
	
}