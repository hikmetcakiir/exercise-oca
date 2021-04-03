

public class MultidimensionalArrays {

	public static void main(String... args) {
		// 1d array
		int[] myArray = new int[] {0, 1};
	
		// 2d array
		int[][] array = new int[2][4]; // 2 rows and 4 columns
		int anotherArray[][] = new int[2][4];
		
		int[] myIntArray[] = new int[2][4];
		
		String[][] my2dArray = new String[][]{
			{"One", "Two"}, // 1st row 2 elements
			{"Three", "Four", "Five"}, // 2nd row 3 elements
			{"Six", "Seven", "Eight", "Nine"}, // 3row with 4 elements
			null
		};

		int[][] numberTable = new int[2][3];
		numberTable[0][0] = 1;
		numberTable[0][1] = 2;
		numberTable[0][2] = 3;
		//numberTable[0][3] = 4; // DOES NOT COMPILE 

		// 3d array
		// pages(planes), rows, columns
		int[][][] threeArray = new int[3][3][3];
		int oneMoreThreeArray[][][] = new int[3][3][3];

		int[] anotherThreeArray[][];

		int[][] a1 = new int[2][];
		int[][][] threeDArray = {
			{{1,2,3},{4,5,6}, {7,8,9}},
			{{10,11,12},{13,14,15},{16,17,18}},
			{{19,20,21},{22,23,24},{25,26,27}}
		};

		System.out.println(threeDArray[0][1][2]);

		System.out.println("***********************");

		int[][] b = {{1,2},{3,4},{5,6},{7,8}};

		for(int i = 0; i < b.length; i++)
			for(int j = 0; j < b[0].length; j++) {
				System.out.println("i= " + i + ", j= " + j + ",b[][]=" + b[i][j]);
			}

		int[][] j = new int[2][0];
		System.out.println(j.length);
		System.out.println(j[0].length);
	}

}