

public class TernaryConstructs{
	
	public static void main(String... args){
		/*
		int bill = 2000;
		int discount = (bill > 2000)? 15 : 10;
		System.out.println("discount= " + discount);
		*/
		
		/*
		int bill = 2000;
		int discount = (bill > 2000)? bill-150 : bill - 100;
		System.out.println(discount);
		*/
	}
	
	public void ternaryConstruct(){
		int bill = 2000;
		int discount = (bill > 2000)? getSpecDisc() : getRegDisc();
		System.out.println(discount);
	}
	int getRegDisc(){
		return 11;	
	}
	int getSpecDisc(){
		return 15;
	}

}