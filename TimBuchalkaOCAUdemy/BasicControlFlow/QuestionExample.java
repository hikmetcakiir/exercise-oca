package BasicControlFlow;

// 1 - D
// 2 - F
// 3 - C (mistake)
// 4 - B (mistake)
// 5 - A
// 6 - E
// 7 - D
// 8 - B

class QuestionExample {

	public static void main(String... args) {
		System.out.println("***************");
		/*
		int m = 9, n = 1, x = 0;
		while(m > n) {
			m--;
			n += 2;
			x += m + n; // x = x + m + n
			//1. iteration m = 8, n = 3, x = 11
			// 2. iteration m = 7, n = 5, x = 23
			// 3. iteration m = 6, n = 7, x = 36
		}
		System.out.println(x);
		*/
		/*
		int x = 4;
		long y = x * 4 - x++;
		if(y < 10) System.out.println("Too Low");
		else System.out.println("Just right");
		else System.out.println("Too High");
		*/
		/*
		System.out.println("Hello");
		for (int i = 0; i < 10; ) {
		 	i = i++; // i = i;
			// i = ++i; // OUTPUT : 8
			System.out.println("Hello World");
		}
		*/

		final char a = 'A', d = 'D';
		char grade = 'B';
		switch(grade) {
			case 12:
			case a:
			case 'B': System.out.print("great");
			case 'C': System.out.print("good"); break; 
			case d:
			case 'F': System.out.print("not good");
		}
	}

}

class TernaryTester{
	public static void main(String[] args) {
		int x = 5;
		System.out.println(x > 2 ? (x < 4 ? 10 : 8) : 7);	
	}
	
}