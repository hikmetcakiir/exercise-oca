package academy.lerningprogramming;


public class UnaryOperators{

	public static void main(String... args){
		int x = +3; // + sign is redundant
		
		System.out.println("x= " + x);

		double y = -x;
		System.out.println("x= " + x + " y= " + y);
		
		y = -y; // -1 * y
		y = -1*y;

		boolean a = true;
		boolean b = !a;
		
		System.out.println("a= " + a + " b= " + b);

		b = !b;
		System.out.println("a= " + a + " b= " + b);

		// int myInt = !5; // does not compile
		// boolean myBoolean = -true; // does not compile
		//boolean z = !0; // does not compile
			
		short s = 5;
		short z = (short)(s + 1);
		System.out.println("********************");
		System.out.println("z= " + z + ", s= " + s);
		System.out.println("********************");

		int myInt = 5;
		int otherInt = ++myInt;
		System.out.println("myInt= " + myInt + " otherInt= " + otherInt);

				
		int newInt = 5;
		int newOtherInt = newInt;
		newInt = newInt + 1;
		//int newOtherInt = newInt++;
		System.out.println("newInt= " + newInt + " newOtherInt= " + newOtherInt);

		int count = 0;
		System.out.println(count);
		System.out.println(++count);//1
		System.out.println(count); // 1
		System.out.println(count--); // 1 
		System.out.println(count); // 1 

		int e = 3;
		int f = ++e * 5 / e-- + --e;
		// e = 3
		// 4 * 5 / e-- + --e -> ++e -> ++3 -> e = 4
		// 4 * 5 / 4 + --e --> e = 3 -> --e -> --4 -> 3
		// 4 * 5 / 4 + 2
		// 20 / 4 + 2
		// 5 + 2
		// 7
		System.out.println("e= " + e + " f= " + f);
		
		//
		int g = 6;
		int h = 2;
		int i = ++h + --g * 3 + 2 * g++ - h-- % --g;
		// 3 + 5 * 3 + 2 * 5 - 3 % 5;
		// 3 + 15 + 10 - 3
		// 25
		System.out.println("i= " + i);
		int temp = 6 % -5;
		System.out.println(temp);

		
	}


}