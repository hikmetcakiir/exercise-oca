
public class ExampleAreaOne{

	public static void main(String... args){
		int hourOfDay = 9;
		/*		
		if( hourOfDay < 11 ){
			System.out.println("Good Morning");
		}
		
		if( hourOfDay >= 11 ){
			System.out.println("Good Afternoon");
		}
		*/
	
		/*
		if( hourOfDay < 11 ){
			System.out.println("Good Morning");
		}else if( hourOfDay < 10 ){
			System.out.println("Good Afternoon");
		}else{
			System.out.println("Good Evening");
		}
		*/
		
		/*
		int value1 = 1;
		if(value1){
			System.out.println("HelloWorld");
		}
		*/

		/*
		int value2 = 10;
		if(value2 = 5){
			System.out.println("HelloWorld");
		}
		*/		
		/*
		int y = 10;
		final int x;
 		
		if( y > 5) {
			x = 2 * y;
		} else {
			x = 3 * y;
		}
		
		final int xy;
		xy = 4; 
		*/
		//static int xy; // DOES NOT COMPILE
		/*
		int valy = 10;
		int valx =  y > 5  ? 2 * y :  3 * y ;
		//int valx =  valy < 5  ? 2 * y :  "Hikmet" ; // Does Not Compile
		System.out.println("valx= " + valx);
		*/
		/*
		float x = 4;
		switch( x ) {
			
			case 0 : 
				System.out.println("0 ==> x= " + x);

			case 1 : 
				System.out.println("1 ==> x= " + x);

			case 2 : 
				System.out.println("2 ==> x= " + x);
	
			case 3 : 
				System.out.println("0 ==> x= " + x);
			
			default :
				System.out.println("Value no 0, 1, 2, 3");
		}
		*/
		/*
		int dayOfWeek =  5;
		switch( dayOfWeek ){
			
			case 0:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Weekday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
		}
		*/
	}
	// private static final int xx; // DOES NOT COMPILE

	private int getSortOrder(String firstName, final String lastName){
		String middleName = "Patricia";
		final String suffix = "JR";
		int id = 0;
		switch( firstName ) {
			case "Test":
				return 52;
			/*
			case middleName:
				id = 5;
				break;	
			*/
			case suffix:
				id = 0;
				break;
			/*
			case lastName:
				id = 8;
				break;
			*/
			/*
			// incompatible types: DayOfWeek cannot be converted to String
			case java.time.DayOfWeek.SUNDAY:
				id = 15;
				break;
			*/
		}
		return (char)1;
	}
		
	private int getSortOrderByInt(int firstName, final int lastName ){
		int middleName = 1;
		final int suffix = 2;
		int id = 0;
		switch( lastName ) {
			case 0:
				return 1;
			case middleName:
				return 2;
		}	
		return (byte) 1;
	}
	
}