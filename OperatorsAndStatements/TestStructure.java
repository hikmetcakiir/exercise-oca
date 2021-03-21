

public class TestStructure{
	
	public static void main(String... args){
		/*
		short valuePro = 3;
		short value = ++valuePro;
		//int y = 0;
		//short value = valuePro + y;
		System.out.println("value= " + value);
		*/
	
		int x = 3;
		int y = ++x * 5 / x-- + --x;
		// 4 * 5 / 4 + 2
		// 20 / 4 + 2
		// 5 + 2 
		// 7
		//System.out.println("x is " + x);
		//System.out.println("y is " + y);	
		
		//int b = 08;

		long xx = 2147483647 + 1;
		//System.out.println(xx);
			
		double fe = 123;
		/*
		switch(fe){
		
		}
		*/
		
		/*
		int xxx = 15;
		 
		while(xxx > 10 ){
			xxx--;
			System.out.println("xxx=" + xxx);
		}
		*/

		int xxx = 15;
		OUTER_IF : if (xxx > 10) {
			while(xxx > 10 ){
				xxx--;
				System.out.println("xxx=" + xxx);
			}
		}
		
		HELLOW : if(10 > 11);

		System.out.println(12+8/5%4*(5-4/5)+4*5);
		// 12 + 8 / 5 % 4 * (5 - 4/5) + 4 * 5
		// 12 + 8 / 5 % 4 * 5 + 4 * 5
		// 12 + 5 + 20
		// 37

		int yyyy = 0;
		int xxxx = 0;
		xxxx = yyyy = -2 + 5 * 7 - 7 / 2 % 5;		
		// -2 + 35 - 3
		// 30
		System.out.println("xxxx= " + xxxx + ", yyyy= " + yyyy);
		
		//short ss = 1921222;

		float f = 2.1f;
		short s = 1;
		char c = 123;
	
	}

}