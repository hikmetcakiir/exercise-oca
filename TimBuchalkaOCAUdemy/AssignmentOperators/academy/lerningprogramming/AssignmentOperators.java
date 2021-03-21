package academy.lerningprogramming;


public class AssignmentOperators{
	
	public static void main(String... args){
		// int x = 1.0; // does not complie		
		//short y = 19812345;
		//int z = 9f;
		//long t = 1923012345678910;

		int x = (int) 1.0;
		short y = (short) 19812345;
		int z = (int) 9f;
		long t = 1923012345678910L;
		
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		System.out.println("z= " + z);
		System.out.println("t= " + t);
		
		byte myByte = 127;
		byte mySecondByte = -128;
		
		System.out.println("myByte= " + myByte);
		System.out.println("mySecondByte= " + mySecondByte);

		// myByte = myByte + 1;
		myByte++;
		mySecondByte--;
		System.out.println("myByte= " + myByte);
		System.out.println("mySecondByte= " + mySecondByte);
		
	}

}