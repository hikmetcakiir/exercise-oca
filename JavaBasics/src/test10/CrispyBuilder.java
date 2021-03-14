package test10;


public class CrispyBuilder{
	

	public static void main(String... args){
		StringBuilder name = new StringBuilder();
		speak(name);
		System.out.println(name); //Webby		
	}
	public static void speak(StringBuilder s){
			s.append("Webby");
	}
}