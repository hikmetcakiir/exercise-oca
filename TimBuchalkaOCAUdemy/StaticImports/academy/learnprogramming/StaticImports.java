package academy.learnprogramming;

import static java.lang.Math.*;
//import static java.lang.Math.PI;
//import static java.lang.Math.min;

import static java.lang.System.out;
import static academy.learnprogramming.Config.*;

public class StaticImports{

	public static void main(String... args){
		int min = Math.min(5,7);
		System.out.println("min= " + min);
		System.out.println(Math.PI);	
	
		System.out.println("*************************");
			
		System.out.println("min= " + min(12,9));
		System.out.println(PI);

		out.println("Hello World");
		
		printConfig();
		// Config.printConfig();

		out.println("name= " + NAME);
	}
}