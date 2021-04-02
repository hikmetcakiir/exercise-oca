


public class StringImmutable {
	
	public static void main(String... args) {
		String hello = "hello";
		//String hi = hello + "world";
		String hi;
		hi = hello; 

		
		System.out.println(hi + hello); // hellohello

		hello = hello.toUpperCase();
		

		System.out.println(hello);		

		// concat
		String s1 = "1";
		String s2 = s1.concat("2"); //12
		s2 = s2.concat("3");
		
		System.out.println(s1); //1
		System.out.println(s2); //123
		
	}
}