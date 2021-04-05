

public class StaticMethodExample {

	public static void main(String... args) {
		StaticMethodExample sme = new StaticMethodExample();
		System.out.println(sme.retNum());
		System.out.println(StaticMethodExample.retNum());		
	}

	public static int retNum() {
		return 2;
	}

}