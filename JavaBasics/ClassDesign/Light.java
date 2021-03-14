

public class Light{
	private int power;
	private String name;
	public Light(int power,String name){
		super();
		this.power = power;
		this.name = name;
		System.out.println("Light class two argument constructore power name started");
	}	
	public Light(int power){ 
		this.power = power;
		this.name = null;
		System.out.println("Light class one argument constructore power started");
	}

}