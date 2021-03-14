 
public class StringBuilderExercises{
	public static void main(String[] args){
		String alpha = "";
		for(char current = 'a'; current <= 'z'; current++){
			alpha += current;
		}
		System.out.println("Value is : "+alpha);
	


		StringBuilder alphaTwo = new StringBuilder();
		for(char current = 'a'; current <= 'z'; current++){
			alphaTwo.append(current);
		}
		System.out.println(alphaTwo);

		

		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = a.append("de");
		b = b.append("f").append("g");
		System.out.println("a="+a);
		System.out.println("b="+b);

		//there are three ways to construct a StringBuilder
		StringBuilder sbOne = new StringBuilder();
		StringBuilder sbTwo = new StringBuilder("HelloWorld!");
		StringBuilder sbThree = new StringBuilder(10);

		
		StringBuilder valueThree = new StringBuilder("animal");
		String sub = valueThree.substring(0,4);
		System.out.println("Value is "+sub);
		System.out.println(valueThree.substring(valueThree.indexOf("a"),valueThree.length()));


		StringBuilder valueFour = new StringBuilder(10);
		valueFour.append("HelloWorld");
		StringBuilder valueFive = valueFour.insert(5,"-"); // .insert(5,'-');
		System.out.println("Result is "+valueFive);

	
		StringBuilder valueSix = new StringBuilder(20);
		valueSix.append("HelloWorld!");
		valueSix.delete(0,valueSix.length()+100);
		System.out.println(valueSix);	
	
		StringBuilder valueSeven = new StringBuilder("HelloGuys");
		valueSeven.deleteCharAt(5);
		valueSeven.deleteCharAt(5);
		valueSeven.deleteCharAt(5);
		valueSeven.deleteCharAt(5); 
		System.out.println(valueSeven);
		



		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		StringBuilder three = one.append("a");
		System.out.println(one == two); //false
		System.out.println(one == three); //true


		String valueX = "Hello World";
		String valueY = " Hello World ".trim();
		System.out.println("Result Value : "+(valueX == valueY)); //false if i use equals ,result is true

		//StringBuilder did not implement equals().If you call equals() on two StringBuilder instances,it will check reference equality







}
}