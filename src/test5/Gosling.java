package test5;

import test4.Bird;

public class Gosling extends Bird{
	public void swim(){
		floatInWater();
		System.out.println(text);
	}
	public static void main(String... args){
		System.out.println("Hello From Gosling");
		Gosling gosling = new Gosling();
		gosling.swim();	
	}

}