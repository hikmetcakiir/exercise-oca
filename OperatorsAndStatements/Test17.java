

public class Test17 {
	
	public static void main(String... args) {
		
		/*
		int x = 4;
		switch(x) {
			case 1: System.out.println("1"); 
			case 1:
		}
		*/
		
		/*
		//x > 2 ? x < 4 ? 10 : 8 : 7;
		Integer a = 123;
		Integer b = 56;
		//int c = add(a, b);
		//System.out.println("c= " + c);
		int aa = 4;
		int bb = 5;
		int c = add(a, b);
		//System.out.println("c= " + c);
		Short y = 12;
		//Long z = y;
		//System.out.println('c');
		char charVal = 92;
		char charVal2 = 103;
		System.out.println((char)(charVal+ charVal2));
		short xxx = 0;
		byte val = -0;
		System.out.println("val= " + val);

		double val2 = 10;
		System.out.println("variable= " + val2);

		*/

		int num1 = 12;
		float num2 = 17.8f;
		boolean eJavaResult = true;
		boolean returnVal = num1 >= 12 && num2 < 4.567 ||eJavaResult == true;
		System.out.println(returnVal);
	}
	/*
	public static int add(Long a, Long b) {
		return a + b;

	}
	*/		
	public static int add(long a, long b) {
		return(int)( a + b);
	}

}