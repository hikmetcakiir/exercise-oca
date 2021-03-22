package Operators.CharacterArithmetic;


public class CharacterArithmetic {

	public static void main(String args	[]) {
	// char 0 - 65535
	char myCharA = 'A';
	char myCharNum = '1';
	
	System.out.println("myCharA= " + myCharA);
	System.out.println("myCharA ,isLetter = " + Character.isLetter(myCharA));
	System.out.println("myCharA isDigit= " + Character.isDigit(myCharA));


	System.out.println("*************************************");

	System.out.println("myCharNum= " + myCharNum);
	System.out.println("myCharNum ,isLetter = " + Character.isLetter(myCharNum));
	System.out.println("myCharNum isDigit= " + Character.isDigit(myCharNum));
	
	// exam examples
	char letter = 65; // A
	int myInt = letter + 3;
	char myNewLetter = (char) myInt;
		
	System.out.println("letter : " + letter);
	System.out.println("myInt : " + myInt);
	System.out.println("myNewLetter : " + myNewLetter);
	
	System.out.println("*************************************");
	char myChar = 65; // A
	char newChar = (char)(myChar + 1);
	int x = myChar;
	boolean b = newChar == 'B';
	boolean c = (newChar++ < 'D');
	
	System.out.println("b= " + b + ", c= " + c);

	//int yyy = 2;
	//char bbb  = yyy;
	
	
	}
}