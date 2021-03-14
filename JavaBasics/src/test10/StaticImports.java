package test10;

//import static java.util.Arrays;
import static java.util.Arrays.*;
import java.util.List;


public class StaticImports{
	
	public static void main(String... args){
		System.out.println("Hello World");
		List<String> values = asList("One", "two", "three", "four");
		values.stream().forEach( value -> { System.out.println(value); });
	}
}