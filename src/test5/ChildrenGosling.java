package test5;


public class ChildrenGosling extends Gosling{
	public static void main(String... args){
		System.out.println("Hello From Children Gosling");
		ChildrenGosling childrenGosling = new ChildrenGosling();
		childrenGosling.hello();
	}
	public void hello(){
		floatInWater();
	}

}