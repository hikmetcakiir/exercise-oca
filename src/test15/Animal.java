package test15;


public class Animal{
	private int age;
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
}

class Lion extends Animal{
	private void roar(){
		System.out.println("The "+getAge()+" year old lions says : Roar!");
	}
}