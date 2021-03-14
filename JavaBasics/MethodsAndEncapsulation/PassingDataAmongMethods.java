
public class PassingDataAmongMethods{
	public static void main(String[] args){
		String name = new String("Webby");
		speak(name);
		System.out.println(name);
	}
	public static void speak(String name){
		name = "Sparky";
	}
}