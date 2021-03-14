package test17;

public class Zebra extends Animal{
	public Zebra(int age){
		super(/*age*/);
		System.out.println("Zebra age parameter constructor");
	}
	public Zebra(){
		//this(4);
		System.out.println("Zebra empty parameter constructor");
	}

	public static void main(String... args){
		System.out.println("Zebra main function");
		Zebra zebra = new Zebra();
	}

}