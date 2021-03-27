

public class Test15 {
	public static void main(String... args) {
		/*
		long a = add(new Float(12),new Float(13));
		System.out.println("a= " + a);	
		*/

		/*
		Long b = Long.valueOf(new Integer(12));	 
		System.out.println("b= " + b);
		*/

		//String s = new String(2);
		Character c = new Character('1');
		Long integer = new Long('1');
		System.out.println("integer= " + integer);
 
		Integer val1 = new Integer(1);
		Integer val2 = 1; 
		Integer val3 = Integer.valueOf("1");
		Integer val4 = 1;


		System.out.println("val1= " + val1);	
		System.out.println("val2= " + val2);

		int var1 = new Short((short)12);
		if(val2 == val4) {
			System.out.println("Equal ");
		}else {	
			System.out.println("Not Equal");
		}
        java.util.ArrayList<Double> a1 = new java.util.ArrayList<>();
		a1.add(111.0);
		//System.out.println(d);
		int i = 10; 
		//System.out.println( i<20 ? out1() : out1() );
	}

	static public void out1(){
	
		}

	protected static long add(Double a, Double b) {
		return (long)(a + b);
	}


}