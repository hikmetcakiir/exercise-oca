package test10;


public class OverloadExercise{
	public void fly(int numMiles){}

	public void fly(Integer numMiles){}
	
	//public static void fly(int numMiles){}
 	
	//public static int fly(int numMiles){}

	//public void fly(int nummmMiles){} // compile error

	//public int fly(int numMiles){} // compile error

	public void fly(short numFeet){}

	public boolean fly(){return false;}
	
	void fly(int numMiles, short numFeet){}

	public void fly(short numFeet,int numMiles) throws Exception{}

	//public void fly(short numFeet,int numMiles) throws Exception{} //Compile error

	//public void fly(int[] lengths){}
	
	public void fly(int... varargs){}

	public static void main(String... args){
		System.out.println("Hello World");
	}
}