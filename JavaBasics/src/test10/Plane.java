package test10;


public class Plane{
	public void fly(int i){
		System.out.println("int ");
	}
	
	public void fly(long l){
		System.out.println("long ");
	}

	public static void main(String[] args){
		Plane p = new Plane();
		p.fly(123);
		long val = 123;
		p.fly(val);
	}
}