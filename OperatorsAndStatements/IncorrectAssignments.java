
public class IncorrectAssignments{
	public static void main(String... args){
	/*
	long bill = 2000;
	int discount = (bill > 2000)? bill-100 : bill - 50;
	*/

	//Long discount = (5000 > 2000)? new Integer(10) : new Integer(15);
	
	/*
	int bill = 2000;
	int qty = 10;
	int discount = (bill > 1000)? (qty > 11)? 10 : 9 : 5;
	System.out.println(discount);
	
	*/
	int bill = 10;
	int discount = (bill > 1000)?10:
9;
	
	/*
	int bill = 2000;
	int qty = 10;
	int discount = (bill > 1000)?
			   (qty > 11)?
				10
				:9
			    :5;
	*/
	}
}