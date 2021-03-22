

public class TestClass {
	
	public static void main(String... args)	{
		//Long.parseLong("12.34");
			
		char c = (char)-3;
		System.out.println(c);	
	
		Long var3 = Long.valueOf(127);
		Long var4 = Long.valueOf(127);
	//	var3 = 4l;
		System.out.println("var3= " + var3);
		System.out.println("var4= " + var4);
		if(var3 == var4)
			System.out.println("Equal");

		final byte age1 = 10;
		final byte age2 = 20;
		short sum = age1 + age2;
		System.out.println("sum= " + sum);

		final short age3 = 30;
		final byte age4 = 20;
		int age5 = age3 + age4;
		System.out.println("age5= " + age5);

		Byte byte2 = new Byte(10);
		System.out.prinln(byte2);
	}

}