

public class Test12 {
	/*
	public static void main(String... args ){
		Test13 t13 = new Test13();
		t13.print();
		//int x = 10;
		//while( x < 11);
	}
	*/
	
	static int value = 24;
	public static void main(String[] args) {
		int value = (value = 3 )* 4;
		System.out.println("value=" + value);
		//System.out.println('a' + 13 );	
		//Byte b = Byte.parseByte("12.43");	

		Long a = new Long(3);

		outer : {
			int x = 4;
			System.out.println("Hello World");
		}
		//System.out.println("x= " + x);
	}
		
	public static void main(String arg){

	}
	
	public static void main(int args){}
	

}


class Test13{
	int x;
	public void print(){
		System.out.println("Hello World From Test13 Class!");
	}
}

class Test14 {
	int y;
	public void print() {
		System.out.println("Hello World From Test14 class!");
	}

}