package animal;

import animal.Lion;
import animal.Cat;


public class Main{
	
	public static void main(String... args){
		Lion lion = new Lion();
		Cat cat = new Cat();
		cat.name = "Seytan Minik";
		System.out.println("kedinin ismi : " +cat.name);
	}

}