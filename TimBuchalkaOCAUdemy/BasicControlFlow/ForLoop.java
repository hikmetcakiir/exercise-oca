package BasicControlFlow;


public class ForLoop {
	
	public static void main(String... args) {
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}

		//System.out.println("i= " + i; // DOES NOT COMPILE
		System.out.println();		

		int a;
		for (a = 0; a < 10; a++) {
			System.out.print(a + " ");				
		}
		
		System.out.println();
		System.out.println("after for loop a= " + a);
		
		/*
		// infinite/endless for loop
		for ( ; ; ) {
			System.out.println("Hello World!");
		}
		*/

		int x = 0;
		for( int y = 0, z = 4; x < 5 && y <10; x++,y++) {
			System.out.println("y= " + y);
		}

		//for(long z = 0, int d = 4; z < 10; z++,d++) {}
		
		for(long z = 0; z < 10; z++) {}
		for(double xy= 0.0; xy < 10.5; xy +=0.5) {}		
		
		System.out.println("x= " + x);
	
		for(int kk = 0; kk < 10 ; kk++)
			System.out.println("hello world");
		
	}

	int x;
	public void add1(){
		int x;
	}
	
	

}