package packagea;


public class Lion{
	int y = 5;
	static int x = add();
	public static int add(){
		return 2;
	}
	
	public static void main(String... args){
		System.out.println("Hello World");
		System.out.println("x= " + x);
		double scientific = 5.000125E-3;
		System.out.println("scientific= " + scientific);
	}
}