
public class Tricky{
	public static void main(String... args){
		Tricky tricky = new Tricky();
		System.out.println(tricky.getClass());

		if("Tricky".equals(tricky.getClass())){
			System.out.println("Equal");
		}else
			System.out.println("Not Equal");
	}	

}