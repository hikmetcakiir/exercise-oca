package test2;


public class Chick{
	private String name = "Fluffy";
	{	System.out.println("setting field");
		System.out.println(name);	}

	//private String name = "Fluffy";
	public Chick(){
		name = "Tinny";
		System.out.println("setting constructor");
	}

	public static void main(String [] args){
		Chick chick = new Chick();
		System.out.println(chick.name);
	}

}