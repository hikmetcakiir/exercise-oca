

public class ForEachLoop {

	public static void main(String... args) {
		String[] names = {"Jimmy", "John", "Tom", "Anthony"};

		for(int i = 0; i < names.length; i++) {
			System.out.println("name= " + names[i]);
		}

		System.out.println("*************************");

		for(String name : names) {
			System.out.println("name= " + name);
		}

		for(String name : names) {
			name = name + " " + name;
		}

		for(String name : names) {
			System.out.println("name= " + name);	
		}

		System.out.println("******************");

		StringBuilder[] builders = {
			new StringBuilder("For"),
			new StringBuilder("Loop")
			
		};

		for(StringBuilder builder : builders) {
			System.out.println(builder);
		}

		for(StringBuilder builder : builders) {
			builder.append("123");
		}

		for(StringBuilder builder : builders) {
			System.out.println(builder);
		}

		String pets = "Parrot";
		
		//for(String pet : pets) { // Does Not Compile
		//}

		//for(int name : names) {} // does not compile

		for(char c : pets.toCharArray()){
			System.out.println(c);
		}

		System.out.println("**************");

		int[] a = {1, 2, 3, 4, 5};
		for(int b : a) {
			System.out.print(b + ", ");
		}
	}

}