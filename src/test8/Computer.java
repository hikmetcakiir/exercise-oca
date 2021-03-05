package test8;


public class Computer{
	
	protected String model = "Hp";
	protected String getComputerModel(){
		return model;
	}
	protected void setComputerModel(String computerModel){
		model = computerModel;
	}
	public static void main(String... args){
		System.out.println("Hello World");
	}
}