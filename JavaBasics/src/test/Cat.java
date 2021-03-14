package test;

public class Cat{
	String name = "Dobby";
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}	
	
	protected Cat(){
	 	System.out.println("Constructore started");	
		name = "Mimi";
	}
	
	{	
	System.out.println("Instance initializer is started");
	 
	 }

	public static void main(String args[]){
		System.out.println("Hello World");
		Cat cat = new Cat();
		System.out.println("Cat name is "+cat.getName());
	}
}