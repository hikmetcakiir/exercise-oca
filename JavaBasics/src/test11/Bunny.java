package test11;

public class Bunny{
	private static String deepColor;
	private String color;
	public Bunny(String color){
		this.color = color;
		deepColor = "Green";
	}
	static{
		//deepColor = "Red";
	}
	public static void main(String... varargs){
		System.out.println("Hello World");
		Bunny bunny = new Bunny("Blue");
		System.out.println("Bunny Color : "+bunny.color);
		System.out.println("Bunny Deep Color : "+bunny.deepColor);
	}

}