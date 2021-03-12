package academy.lerningprogramming;


public class UnderstandingNull{
	
	static Object myObject = new Object();
	static Object myOtherObject;	
	static int myInt;

	static String myString;
	
	public static void main(String... args){
		Object myLocalObject = new Object();
		Object anotherLocalObject;

		String name = "Java";
		String anotherName = null;
		
		System.out.println("myObject= " + myObject);
		System.out.println("myOtherObject= " + myOtherObject );
		
		
		System.out.println("myLocalObject= " + myLocalObject);			
		//System.out.println("anotherLocalObject= " + anotherLocalObject);
		
		myString.toLowerCase();
		System.out.println("**");
	}
}