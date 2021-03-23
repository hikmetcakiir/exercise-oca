package BasicControlFlow;


public class DoWhileLoop {

	int x = 0;	
	public static void main(String[] args) {
		//int x = 0;
		int a = 0;
		
		do{
		   a++;
		} while (false);

		System.out.println("a= " + a);

		int x = 20;
		
		while (x > 10) x--;
		System.out.println("x= " + x);

		int x2 = 20;
		do x2--;
		while(x2 > 10);

		System.out.println("x2= " + x2);

		int y = 10;
		int z = 5;
		while(y < 20) {
		     y++;
		}
		     z += 2;
		     y += 10;

		System.out.println("x= " + x + " y= " + y + ", z= " + z);
		
		int number = 10;
		
		while(number > 10) {
			number--;
		}

		do {
			number--;
			
			while(number > 5){
				number += 1;
			}
		}while (number < 10);

		System.out.println("number= " + number);
	}

}