
import java.util.Arrays;

public class Varargs {

	public static void main(String... args) {
		System.out.println("result= " + print(args));		
	}

	public static String[] print(String... args) {
		System.out.println("args.length= " + args.length);
		System.out.println("args Elements : " +Arrays.toString(args));
		return args;
	}

	public void walk11(int... nums) {}

	public void walk2(int start, int...nums) {}

	//public void walk3(int... nums, int start) {}

	//public void walk4(int... start, int... nums){}

}