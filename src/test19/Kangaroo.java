package test19;


public class Kangaroo extends Marsupial{
	public static boolean isBiped(){
		return true;
	}
	public void getKangarooDescription(){
		System.out.println("Kangaroo hops on two legs : "+isBiped());
	}

	public boolean isBiped2(){
		return true;
	}

	public void getKangarooDescription2(){
		System.out.println("Kangaroo hops on two legs  2 : "+isBiped2());
	}

	public static void main(String... args){
		Kangaroo joey = new Kangaroo();
		joey.getMarsupialDescription2();
		joey.getKangarooDescription2();
	}

}