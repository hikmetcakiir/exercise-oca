package test16;

public class Lion implements identical{
	public boolean canSwim(boolean isSwim){
		return isSwim;
	}
}

interface identical{
	boolean canSwim(boolean isSwim);
}