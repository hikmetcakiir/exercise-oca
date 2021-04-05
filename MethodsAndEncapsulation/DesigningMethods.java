

public class DesigningMethods {


	public static void main(String... args) {
		 Long a = 5L;
		 long b = 5;
		 if(a.equals(b)) System.out.println("Equal");
	}

	public void walk1() {}
	//default void walk2() {} // DOES NOT COMPILE
	//void public walk3() {} // DOES NOT COMPILE
	void walk4() {}

	public void walk11() {}
	public final void walk12() {}
	public static final void walk34() {}
	//public modifier void walkt53() {}
	//public void final walk67() {}
	final public void walk76() {}
	
	public strictfp final static void walk88(){}

	public void walk14() {
		
	}

	public void walk15() {
		return;
	}

	public String walk35() {
		return "";
	}
	/*
	public String walk39(){
	}
	*/
	/*	
	public walk66(){}
	*/
	/*
	String walk67(int a){
		if(a == 4) return " "; 
	}
	*/

	int integer(){
		return 9;
	}

	int long2(){
		return 4;
	}
}