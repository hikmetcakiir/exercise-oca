package test10;


import java.util.List;
import java.util.Arrays;
import static java.util.Arrays.asList;


public class Imports{
	public static void main(String... args){
		List<String> list = Arrays.asList("one","two");

		list.stream().forEach(x -> {System.out.println(x);});
	}
}