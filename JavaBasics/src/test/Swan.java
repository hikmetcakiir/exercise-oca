package test;

class Swan{
	int numberEggs; // instance variable
	public static void main(String [] args){
		Swan mother = new Swan();
		mother.numberEggs = 1; //set variables
		System.out.println(mother.numberEggs); //read variable	
	}
}