package test4;

import test3.MotherDuck;

public class ChildrenDuck{

	public static void main(String args[]){
		System.out.println("Hello from Children Duck");
		MotherDuck motherDuck = new MotherDuck();
		motherDuck.quackTwo();
	}
}