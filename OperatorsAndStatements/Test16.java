
public class Test16 {
	
	final int a;

	Test16(){
		a = 10;
	}

	public static void main(String... args) {
		Test16 t = new Test16();
		System.out.println(t.a);


		int lion = 11;
		int tiger = ++lion *  5 / lion--;
	 	System.out.println("tiger= " + tiger);
	 	System.out.println("lion= " + lion);
	}


}