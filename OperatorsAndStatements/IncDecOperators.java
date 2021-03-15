

public class IncDecOperators{

	public static void main(String... args){
		int counter = 0;
		System.out.println(counter);
		System.out.println(++counter);
		System.out.println(counter);
		System.out.println(counter--);
		System.out.println(counter);
		
		System.out.println("***********************");
		int x = 3;
		int y = ++x * 5 / x-- + --x;
		System.out.println("x is " + x);
		System.out.println("y is " + y);

		
	}

}