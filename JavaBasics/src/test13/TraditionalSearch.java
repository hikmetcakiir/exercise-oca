package test13;

import java.util.List;
import java.util.ArrayList;

public class TraditionalSearch{
	static int x = 4;
	public static void main(String[] args){
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("fish", false, true));
		int y = 6;
		print(animals,(Animal a)-> {x = 5; if(y > 4) System.out.println("Hi Guys"); return a.canHop(); } );
	}
	private static void print(List<Animal> animals, CheckTrait checker){
		for(Animal animal : animals){
			if(checker.test(animal)){
				System.out.println(animal + " ");
			}
		}
		System.out.println();
	}
}