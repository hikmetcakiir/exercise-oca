package test15;


public class House{
	protected int roomNumber;
	protected float size;
	long weight;
	String location;	

	protected float calculateHousePrice(){
		return roomNumber * size * weight * location.length();
	}

	public String getLocation(){
		return location;
	}
}