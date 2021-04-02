

public class StringPoolAndStringEquality {

	
	public static void main(String... args) {
		String name = "John";
		String anotherName = "John";
		String john = "Jo" + "hn"; // John
		String newName = new String("John");

		System.out.println("name == anotherName -> " + (name == anotherName));
		System.out.println("name == john -> " + (name == john));
		System.out.println("name == newName -> " + (name == newName));

		System.out.println("***************************");
	
		System.out.println("name.equals(anotherName) -> " + name.equals(anotherName));
		System.out.println("name.equals(john) -> " + name.equals(john));
		System.out.println("name.equals(newName) -> " + name.equals(newName));
	
		System.out.println("********************************");	

		System.out.println("name - identityHashCode -> " + System.identityHashCode(name));
		System.out.println("anotherName - identityHashCode -> " + System.identityHashCode(anotherName));
		System.out.println("john - identityHashCode -> " + System.identityHashCode(john));
		System.out.println("newName - identityHashCode -> " + System.identityHashCode(newName));
		
		
		String str1 = "abc";
		String str2 = "ab";
		String str3 = "ab" + "c"; // c is constant or literal
		//String str3 = str2 + "c"; // different refference 
		
		System.out.println(System.identityHashCode(str));

		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
			
	}
}