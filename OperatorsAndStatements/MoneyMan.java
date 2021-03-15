
public class MoneyMan{

	public static void main(String... args){
		int y = 4;
		double x = 3 + 2 * --y;
		System.out.println("x=" + x);

		System.out.println("*************");

		int value1 = 2 * 5 + 3 * 4 - 8;
		System.out.println("value1=" + value1);

		System.out.println("*************");
		int value2 = 2 * ((5 + 3) * 4 - 8);
		System.out.println("value2=" + value2);
				
		System.out.println("*************");
		System.out.println(9 / 3);
		System.out.println(-10 % -9);
		System.out.println(9 % -1);
		
		System.out.println("*************");		
		int value4 = 1;
		long value3 = 33;
		System.out.println(value3 * value4);
		
		//type learning code
		System.out.println(((Object)value4).getClass().getName());

		System.out.println("*************");		
		double xx = 39.21;
		float yy = 2.1f;
		float zz = (float)(yy + xx);

		System.out.println("*************");		
		short value5 = 10;
		short value6 = 3;
		System.out.println(value5 / value6);

		short value7 = 14;
		float value8 = 13;
		double value9 = 30;
		System.out.println(value7 * value8 / value9);
		
		
	}

}