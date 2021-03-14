package test18;


public class Wolf extends Canine{
	public double getAverageWeight() throws RuntimeException{
		throw new RuntimeException();
		//return super.getAverageWeight()+20;
		// return getAverageWeight() + 20;	// INFINITE LOOP
	}
	 
	public static void main(String... args){ 
	}
}