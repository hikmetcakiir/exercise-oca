

public class PassByValue{
	public static void change(String value1){
		value1 = "hello";
	}
	
	public static void main(String[] args){
		String value = "world";
		change(value);
		System.out.println(value);
		
	}
}