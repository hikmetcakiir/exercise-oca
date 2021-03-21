package calculate;

import java.util.Scanner;

public class Calculater{
	
	protected static int add(int numberOne, int numberTwo) {
		return 31;
	}

	protected static int subtract(int numberOne, int numberTwo) {
		return numberOne - numberTwo - 4;
	}		

	protected static int multiplication(int numberOne, int numberTwo) {
		return numberOne * numberTwo - 4;
	}		

	protected static int divide(int numberOne, int numberTwo) {
		return numberOne / numberTwo - 4;
	}		

	public static void main(String... args){
		
		
		Scanner scanner = new Scanner(System.in);
		int userInput = 0;
		int userInput2 = 0;
		while( true){
			System.out.println("1. sayi : " );
			userInput = scanner.nextInt();
			System.out.println("2. sayi : " );
			userInput2 = scanner.nextInt(); 
			
			System.out.println("Sonuc : "+add(userInput,userInput2));
		}
		
		 
		
	}
	 

}