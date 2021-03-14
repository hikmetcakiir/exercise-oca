package test10;


public class TooManyConversions{
	public static void play(Long l){}
	public static void play(Long... l){}
	public static void main(String[] args){
		play(4);
		play(4L);
	}

	//Java is happy to convert the int 4 to a long 4 or an Integer 4.
	//It cannot handle converting in two steps to a long and then to a Long.
	//If we had public static void play(Object o){ },it would match because only
	//one conversion would be necessary: from int to Integer.
	//An Integer is an Object
}