package test3;


public class MotherDuck{
	String noise = "quack";
	void quack(){
		System.out.println(noise);
	}
	private void makeNoise(){
		quack();
	}
	public static void main(String... $n){
		System.out.println("Hello World");	
	}
	public void quackTwo(){
		quack();
	}
}