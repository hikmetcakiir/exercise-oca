package test18;


public class Reptile{
	protected boolean hasLegs() throws InsufficientDataException {
		throw new InsufficientDataException();
		//return false;
	}
	protected double getWeight()throws Exception{
		throw new Exception(); 
		//return 2;
	}
}