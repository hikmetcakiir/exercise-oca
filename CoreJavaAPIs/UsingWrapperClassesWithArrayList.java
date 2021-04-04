
import java.util.*;

public class UsingWrapperClassesWithArrayList {

	public static void main(String... args) {
		//List<double> doubleList = new ArrayList<>(); // does not compile
		List<Double> doubleList = new ArrayList<>();
		
		doubleList.add(10.5); // autoboxing
		doubleList.add(new Double(55.10));
		doubleList.remove(55.10); // autoboxing
		double first = doubleList.get(0); // unboxing
		doubleList.add(new Double(10));
		doubleList.add(null);
		System.out.println(doubleList);
		Double d = new Double(10);
 
		System.out.println(doubleList);

		int b = doubleList.get(0);
	}


}