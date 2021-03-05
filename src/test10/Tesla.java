package test10;


public class Tesla{
	public static int count = 0;
	
	public Tesla(){
		System.out.println("Tesla Constructor Is Initialized");
	}
	
	public static void main(String... args){
		System.out.println("Hello From Tesla Class");
		sayHi();
		new Tesla().sayHowAreYou();
		sayGoodBy();		
	}

	static public void sayHi(){
		System.out.println("Hi Guys!");
	}
	public void sayHowAreYou(){
		System.out.println("How Are You Sir!");
	}
	public static void sayGoodBy(){
		System.out.println("Good Buy Buddies");
	}


}