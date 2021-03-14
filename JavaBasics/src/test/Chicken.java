package test;

public class Chicken{ 
	public Chicken(){
		System.out.println("Hello World");
		System.out.println(name);
	}	

	String name = "Carlie";

	public static void main(String... args){
		Chicken chicken = new Chicken();	
	}
}

