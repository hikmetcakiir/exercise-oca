

public class TestControlFollow{

	public static void main(String args[]){
		/*
		boolean allow = false;
		if(allow = true){
			System.out.println("Inside if");
		}
		else
			System.out.println("Outside if");
		*/
	
		/*
		int bill = 2000;
		int discount = bill > 2000 ? 15 : 20;
		System.out.println("dicount= " + discount);

		byte myByte = 10;
		switch (myByte) {
			//case 1.2 :
		}
		*/
		
		int i = 10;
		for(System.out.println("initialize part") ; i > 5; i--) {
			System.out.println("Hello World");
		}
		int z;
		outer :{
			int y = 2;
			int[] my_array = {1, 2, 3};
			}		
		

		String[] programmers = {"Outer", "Inner"};
		for (String outer : programmers){
			for (String inner : programmers) {
				if(inner.equals("Inner")){
					break;
				}
				System.out.print(inner + ":");
			}
		}

	}

}