package test19;

public class Panda extends Bear{
	public static void eat(){
		System.out.println("Panda bear is chewing");
	}
	public static void main(String... args){
		Panda.eat();
		Panda panda = new Panda();
		panda.walk();
	}
	
	public static void hibernate(){
		System.out.println("Panda bear is going to sleep");
	}

	public void walk(){
		System.out.println("i must not any number :] ");
	}

}