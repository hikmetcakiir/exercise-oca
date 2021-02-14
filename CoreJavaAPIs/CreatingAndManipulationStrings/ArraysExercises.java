
import java.util.Arrays;

public class ArraysExercises{
	public static void main(String... $n){

		int[] number1 = new int[3];
		for(int i = 0; i < 3; i++){
			System.out.print(number1[i]);
		}
		//OUTPUT : 000

		int[] numbers2 = {30,60,90};
		for(int i = 0; i < numbers2.length; i++)
			System.out.print(numbers2[i]);

		
		int   [] number3 = {45,45,90};
		for(int i = 0; i < number3.length; i++){
			System.out.println(number3[i]);
		}

		System.out.println();
		
		int number4[] = new int[4];
		number4[0] = 3;
		number4[1] = 4;
		for(int i = 0; i < number4.length; i++)
			System.out.println(number4[i]);

		
		int number5     [] = {50,60,70};
		for(int i = 0; i < number5.length; i++){
			System.out.println(number5[i]);
		}


		String[] strings = {"stringValue"};
		Object[] objects = strings;
		String[] againStrings = (String[]) objects;
		// againStrings[0] = new StringBuilder(); //doesn't compile because String[] only allows String Objects and StringBuilder is not a String
		//objects[0] = new StringBuilder();


		String[] animals = {"cat","dog","aliphant"};
		System.out.println(animals.length);
		System.out.println(animals[0]);
		System.out.println(animals[1]);
		System.out.println(animals[2]);

		System.out.println();

		int[] numbersSix = new int[10];
		for(int i = 0; i < numbersSix.length; i++)
			numbersSix[i] = i + 5;

		

		long[] numberSeven = new long[5];
		numberSeven[0] = 52L;
		numberSeven[1] = 43L;
		numberSeven[2] = 24L;
		numberSeven[3] = 15L;
		numberSeven[4] = 56L;
		System.out.println("Array did not sort form ");
		for(int i = 0; i < numberSeven.length; i++){
			System.out.println(numberSeven[i]);
		}
		
		Arrays.sort(numberSeven);
		System.out.println("Array sort form ");
		for(int i = 0; i < numberSeven.length; i++){
			System.out.println(numberSeven[i]);
		}
		


		long[] numberEight = new long[5];
		numberEight[0] = 52L;
		numberEight [1] = 43L;
		numberEight [2] = 24L;
		numberEight [3] = 15L;
		numberEight [4] = 56L;
		Arrays.sort(numberEight);
		System.out.println(Arrays.binarySearch(numberEight,21));
		System.out.println(Arrays.binarySearch(numberEight,45));
		System.out.println(Arrays.binarySearch(numberEight,32));
		System.out.println(Arrays.binarySearch(numberEight,15));
		System.out.println(Arrays.binarySearch(numberEight,214));
		


		int[][] vars1; //2D Array
		int vars2 [][];
		int[] vars3[];
		int[] vars4[],space [][]; //a 2D and a 3D array
		

		String [][] rectangle = new String[3][2]; // [0][0] ==> [2][1]

		int [][] diffSize = {{1,4},{3},{9,8,7}};
		System.out.println("Range : "+diffSize.length+", "+diffSize[2].length);


		int[][] exampleArray = new int[0][];
		//int[] exampleArrayTwo = new int[]; //array dimension missing



	}
}