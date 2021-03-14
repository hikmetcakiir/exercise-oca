package cakirmarket;

import cakirmarket.product.fruit.Apple;
import cakirmarket.product.fruit.Banana;
import cakirmarket.product.fruit.Strawberry;

import cakirmarket.product.food.Bread;

import static java.lang.System.out;

public class Main{

	private static Apple apple;
	private static Banana banana;
	private static Strawberry strawberry;
	private static Bread bread;
	
	static{
		apple = new Apple();
		banana = new Banana();
		strawberry = new Strawberry();
		bread = new Bread();
	}
	
	static{
		//Initialize to instance variable apple object
		apple.setPrice(1.3f);
		apple.setColor("green");
		apple.setQuantity(50);
	}

	static{
		//Initialize to instance variable banana object
		banana.setPrice(2);
		banana.setColor("yellow");
		banana.setQuantity(20);
	}

	static{
		//Initialize to instance variable strawberry object
		strawberry.setPrice(1.5f);
		strawberry.setColor("red");
		strawberry.setQuantity(40);
	}
	
	static{
		//Initialize to instance variable bread object
		bread.setPrice(1);
		bread.setColor("brown");
		bread.setQuantity(30);
	}

	

	public static void main(String... args){
		sayGoodGreeting();
		createNewLine();
		createNewLine();
		showToMarketMenu();
		
	}

	public static void createNewLine(){
		out.println();
	}

	public static void sayGoodGreeting(){
		out.print("Welcome to the Cakir Market");
	}

	public static void showToMarketMenu(){
		System.out.println(apple.getClass());
		System.out.println(banana.getClass());
		System.out.println(strawberry.getClass());
		System.out.println(bread.getClass());
	}

}