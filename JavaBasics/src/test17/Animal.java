package test17;

public class Animal{
	{	System.out.println("Anchestor class instance initializer");		}
	static
	{	System.out.println("Anchestor class static initializer");		}
	private int age;
	public Animal(/*int age*/){
		 
		//this.age = age;
		System.out.println("Animal age parameter constructor");
		//super();	// Call to super must be first statement in constructor
		System.out.println("Age value : "+age);
	}

}