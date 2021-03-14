package test21;


public class Hello{
	int x = 4;
	int y = x + 5;
	
	
	public static void main(String... args){
		Hello h = new Hello();
		h.getHello();
		System.gc();
	}
	public void getHello(){
		Hello h = new Hello();		
	}
	public void finalize(){
		System.out.println("Hello World");
	}
}