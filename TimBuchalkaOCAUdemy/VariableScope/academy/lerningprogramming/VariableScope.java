package academy.lerningprogramming;


public class VariableScope{

	static int myNewInt = 5;
	static{
		System.out.println("static initializers starting");	
	}
	{
		int myDeclaredVariablesForTest = 5;
		System.out.println("instance initiazliers starting"); 
	}
	public static void main(String... args){
		int myLocalInt = 10;
		{
			{
				System.out.println("middle scope starting");
				{
					int testVariable = 4;
					System.out.println(testVariable);
					System.out.println("most inner scope starting");
				}
			}
		}


		{
			int myOtherInt = 20;
			System.out.println("myOtherInt= "+ myOtherInt);	
			System.out.println("inCodeBlock myLocalInt= "+ myLocalInt);
		}								
		
		//System.out.println("myOtherInt= "+ myOtherInt); //DOES NOT COMPILE
		System.out.println("myLocalInt= "+ myLocalInt);
		System.out.println("myNewInt= " + myNewInt);
		
		int myOtherInt = 30;
		System.out.println("myOtherInt= " + myOtherInt);

		myMethod();
		System.out.println("myNewInt= " + myNewInt);
	}

	public static void myMethod(){
		int myNewInt = 5;
		myNewInt = 30;
	}
}