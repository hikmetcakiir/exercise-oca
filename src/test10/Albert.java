package test10;


public class Albert{
	public static void main(String... $n){
		System.out.println("Hello World");
		Tesla tesla = new Tesla();
		System.out.println(tesla.count);
		tesla.count++;
		System.out.println(tesla.count);
		tesla = null;
		System.out.println(tesla.count);
		tesla.count++;
		System.out.println(tesla.count);
	}
}