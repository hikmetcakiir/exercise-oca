package test12;

public class Crispy{
	private String color;
	private int weight;

	public Crispy(int weight){
		this.weight = weight;
		color = "brown";
	}

	public Crispy(int weight, String color){
		//Crispy(weight);	// DOES NOT COMPILE
		//new Hamster(weight);	// Its okey	
		//int x = 4; 		// test12\Crispy.java:16: error: call to this must be first statement in constructor
		this(weight);		
		this.weight = weight;
		this.color = color;
	}

	public static void main(String... args){
		System.out.println("Hello World From Hamster");
	}
}