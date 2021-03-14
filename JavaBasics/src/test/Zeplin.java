package test;

import test.Kangaroo;

public class Zeplin{

	static public void main(String... vargs){
		System.out.println("Zeplin is started");
		Kangaroo kangaroo = new Kangaroo();
		kangaroo.setName("Hi! I am Kangaroo");
		System.out.println("Kangaroo is greetings to you!");
		System.out.println(kangaroo.getName());
	}
}