package test10;

import java.util.ArrayList;

public class Ziggler{
	public static final int QUITE_ID = 10;
	private static final ArrayList<String> values = new ArrayList<>();
	private static ArrayList<String> valuesTwo = new ArrayList<>();
	public static void main(String... $n){
		System.out.println("Hello World");
		values.add("Hello World");
		System.out.println(values.get(0));
		values.add("Hello World");
		//values = valuesTwo;
	}

}