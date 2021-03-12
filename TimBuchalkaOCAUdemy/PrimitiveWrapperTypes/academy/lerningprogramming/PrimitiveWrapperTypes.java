package academy.lerningprogramming;


public class PrimitiveWrapperTypes{
	
	public static void main(String... args){
		int myInt = 10;
		Integer myInteger = new Integer(10);
		Integer myInteger2 = 20;
		Integer myInteger3 = Integer.valueOf(10);
		Integer myInteger4 = Integer.parseInt("3");
		Integer myInteger5 = null;
		//int myInt2 = null;
		
		System.out.println("myInteger= " + myInteger);
		System.out.println("myInteger2= " + myInteger2);
		System.out.println("myInteger3= " + myInteger3);
		System.out.println("myInteger4= " + myInteger4);
		System.out.println("myInteger5= " + myInteger5);

		printSum(1,5); //autoboxing
		printSum(myInteger2,myInteger3);
		
		0x15332.123123e123
		float cd = 3.0f;
		long b = 8_231_241_231L;
		//printSum(2.0,3.0);
		//add(14123123123123123123123123,12);
	}
	private static void printSum(Integer first, Integer second){
		Integer sum = first + second;
		System.out.println("sum= " + sum);
	}
	private static  void add(int a, int b){
		
	}
}