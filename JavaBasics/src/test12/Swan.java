package test12;

public class Swan{
	private int numberEggs;
	public int getNumberEggs(){
		return numberEggs;
	}
	public void setNumberEggs(int numberEggs){
		if(numberEggs >= 0)
			this.numberEggs = numberEggs;
	}
}