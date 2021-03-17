

public class InCorrectUsage{

	public static void main(String... args){
		/*
		int bill = 2000;
		int qty = 10;
		int discount = ++qty ? 10: 20;
		*/

		//int y =  (500 > 200)? 10 : 20;
		
		int bill = 2000;
		int discount = (bill > 2000)? {bill - 150} : {bill - 100};
	}
}