package root.primate;

import java.util.Random;

public class Chimpanzee implements PrimateBasicBehavior{
	
	public boolean isHop(){
		return true;
	}

	public boolean isTalk(){
		return false;
	}

	public int weight(){
		Random randomNumberGenerator = new Random();
		int chimpanzeeWeight = randomNumberGenerator.nextInt(40);
		return chimpanzeeWeight;
	}
	
	public boolean isRun(){
		return true;
	}

}