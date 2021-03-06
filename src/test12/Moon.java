package test12;

public class Moon{
	private final String value;
	private final static String variable;
	{	value = "Hi Buddy!";	}
	/*
	public Moon(){
		value = "Hello World";
		variable = "Hi";
	}
	*/
	static{
		//value = "Hello Buddy";	// DOES NOT COMPILE
		variable = "Hello";
	}
	public static void main(String... args){
		System.out.println("Hello World");
	}
}