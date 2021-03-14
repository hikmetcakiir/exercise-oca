

public class Aurora extends Light{
	public Aurora(int powerOfLight){
		super(powerOfLight,"Aurora");
		System.out.println("Aurora parameter constructore powerOfLight started");
	}
	public Aurora(){
		super(5);
		System.out.println("Aurora default constructore started");
	}

	public static void main(String... $args){
		System.out.println("Main Class is started");
	}
}