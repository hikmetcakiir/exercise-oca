 

public class StringBuilderExercises{
	static final public void main(String... $n){
		System.out.println("Hello World");

		//StringBuilder is not immutable,it is mutable
		
		String alpha = "";
		for(char current = 'a'; current <= 'z'; current++){
			alpha += current;
		}
		System.out.println(alpha); // this is very inefficient

		StringBuilder alphaTwo = new StringBuilder();
		for(char current = 'a'; current <= 'z'; current++){
			alphaTwo.append(current);
		}
		System.out.println(alphaTwo);

		StringBuilder sb = new StringBuilder("start");
		sb.append("+middle"); // sb = "start+middle";
		StringBuilder same = sb.append("+end");
		System.out.println(same);


		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = a.append("de");
		b = b.append("f").append('g');
		System.out.println("a="+a);
		System.out.println("b="+b);

		//There are three ways to construct a StringBuilder
		StringBuilder sb10 = new StringBuilder();
		StringBuilder sb11 = new StringBuilder("animal");
		StringBuilder sb12 = new StringBuilder(10);

		//charAt(),indexOf(),length(),substring()
		StringBuilder sb44 = new StringBuilder("animals");
		String sub = sb44.substring(sb44.indexOf("a"));
		System.out.println(sub);

		//substring() return a String rather than a StringBuilder

		StringBuilder sb55 = new StringBuilder().append(1).append('c');
		sb55.append("-").append(true);
		System.out.println(sb55);

		StringBuilder sb66 = new StringBuilder("animals");
		sb66.insert(7,"-");
		sb66.insert(0,"-");
		StringBuilder sb77 = sb66.insert(4,"-");
		System.out.println(sb77);

		//StringBuilder delete(int start,int end);
		//StringBuilder deleteCharAt(int index);
			
		StringBuilder sb123 = new StringBuilder("HelloWorld!");
		sb123.delete(0,0);
		System.out.println(sb123);

		//StringBuilder reverse()

		StringBuilder sb99 = new StringBuilder("ABC");
		sb99.reverse();
		System.out.println(sb99);

		//String toString()

		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		StringBuilder three = one.append("a");
		System.out.println(one == two); //false
		System.out.println(one == three); //true

		StringBuilder four = new StringBuilder("HelloWorld!");
		four.replace(0,4,"H");
		System.out.println(four);

		/*
		java.lang.StringBuilder

		Constructor
		StringBuilder()
		StringBuilder(int capacity)
		StringBuilder(CharSequence seq)
		StringBuilder(String str)


		StringBuilder append(boolean b)
		StringBuilder append(char c)
		StringBuilder append(char[] str)
		StringBuilder append(double d)
		StringBuilder append(float f)
		StringBuilder append(int i)
		StringBuilder append(long lng)
		StringBuilder append(CharSequence s)
		StringBuilder append(String str)
		
		char charAt(int index)
		StringBuilder delete(int start,int index)
		StringBuilder deleteCharAt(int index)

		StringBuilder insert(int offset,double,float,int,long.. s)

		int length()
		String substring(int start,int end)
		StringBuilder reverse()
		StringBuilder replace(int )


		*/

	}
}