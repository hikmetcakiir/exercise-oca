package test21;

public class Descendent{
	public static void display(){
		System.out.println("Descendent is saying hello world");
	}
	
	public static void main(String... args){
		Descendent d = new Descendent();
		d.display();
	}

}