

public class MethodChaining {

	public static final void main(String args[]) {
		System.out.println("Hello World");
		String start = " Java ";
		String chaningStart = start.toLowerCase().trim();
		System.out.println("start= " + start);
		System.out.println("chaningStart= " + chaningStart);

		String trimmed = start.trim();
		String lowerCase = trimmed.toLowerCase();
		System.out.println("lowerCase= " + lowerCase);

		String result = lowerCase.replace('j','J');
		System.out.println("result= " + result);

		String anotherResult = "   Java   ".trim().toLowerCase().replace('j', 'J');
		System.out.println("anotherResult= " + result);
		System.out.println(result.equals(anotherResult));

		String a = "abc";
		String b = a.toUpperCase(); // produces new string  does not change a variable
		String c = b.replace('B', 'b').replace("C","c"); // produces new String

		System.out.println("a= " + a + ", b= " + b + ", c= " + c);

		if(a.equalsIgnoreCase(b)) {
			System.out.println("String are equal");
		} 

		if(a.toLowerCase().trim().equals(b.toLowerCase().trim())) {
			System.out.println("Equal");
		}

		
	}

}