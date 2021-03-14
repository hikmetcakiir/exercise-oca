package test17;

public class Shark extends Fish{
	
	private int numberOfFins = 8;
	
	public Shark(int age){
		super(age);
		this.size = 4;
	}
	
	public void display(){
		System.out.println("Shark with age : "+this.getAge());
		System.out.println(" and "+super.size+" meters long");
		System.out.println(" with "+this.numberOfFins+" fins");
	}
	
	public static void main(String... args){
		new Shark(5).display();
	}
}