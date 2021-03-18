
public class FlowControlExample{

	public static void main(String... args){
		/*
		int total= 0;
		int primeNums[] = {2, 3, 7, 11};
		for(int num : primeNums){
			total += num;
		}		
		System.out.println("total= " + total);
		*/
		
		/*
		StringBuilder myArr[] = { new StringBuilder("Java"),
					  new StringBuilder("Loop")		
			 };
		for (StringBuilder val : myArr) {
			System.out.println(val);
		}
		
		for (StringBuilder val : myArr) {
			val.append("Oracle");
		}

		for (StringBuilder val : myArr) {
			System.out.println(val);
		}
		*/

		int[] myArr = new int[5];
		for (int i=0; i<myArr.length; ++i) {
			//myArr[i] = i;
			if ((myArr[i] % 2) == 0) {
				myArr[i] = 20;
			}
		}
		
		for(int val : myArr)
			System.out.println("val= " + val);
	}

}