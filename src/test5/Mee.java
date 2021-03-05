package test5;

import test4.Bird;

public class Mee{
	public static void main(String... args){
		System.out.println("Hello from mee class");
		Bird bird = new Bird();
		//System.out.println("Value : "+bird.text);
		Gosling gosling = new Gosling();
		gosling.swim();
	}
}