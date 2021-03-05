package test6;


public class Cat{
	protected String name = "Snoopy";
	String surname = "Chealse";

	protected String getCatName(){
		return name;
	}

	String getSurname(){
		return surname;
	}

	public static void main(String... args){
		System.out.println("Hello From Cat");
	}
}