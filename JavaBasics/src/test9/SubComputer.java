package test9;

import test8.Computer;

public class SubComputer extends Computer{
	public String fakeModel = getComputerModel();
	

	public static void main(String... args){
		System.out.println("Hello World From SubComputer");
		SubComputer subComputer = new SubComputer();
		System.out.println("SubComputer Model : "+subComputer.fakeModel);
		Computer computer = new Computer();
		 getComputerModel();
	}
}
