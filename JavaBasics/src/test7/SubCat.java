package test7;

import test6.Cat;

public class SubCat extends Cat{
	public String sayHi(){
		return name;
	}

	public static void main(String ... $_n){
		System.out.println("Hello From SubCat");	
		SubCat subCat = new SubCat();
		System.out.println("Greeting from "+subCat.sayHi());
	}
}