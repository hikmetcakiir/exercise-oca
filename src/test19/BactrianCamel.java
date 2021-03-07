package test19;


public class BactrianCamel extends Camel{
	protected int getNumberOfHumps(){
		return 2;
	}
	public static void main(String    ... args){
		BactrianCamel bc = new BactrianCamel();
		System.out.println("Returned Value : "+bc.getNumberOfHumps());
		System.out.println("Returned Check Value : "+returnCheckControl());
	}

	public static int returnCheckControl(){
		// return 2l; //COMPILE ERROR
		return 3; 
	}

}