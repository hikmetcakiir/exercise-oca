package test13;

public class NotImmutable{
	private StringBuilder builder;
	public NotImmutable(StringBuilder b){
		builder = new StringBuilder(b);
	}
	public StringBuilder getBuilder(){
		return new StringBuilder(builder);
	}
	public static void main(String... ____){
		System.out.println("Hello World");

		StringBuilder sb = new StringBuilder("Hello From Ice Age!");
		NotImmutable notImmutable = new NotImmutable(sb); 
		sb.append("What r u doing today?");
		notImmutable.getBuilder().append("Good,What r u doing today too ?");
		System.out.println("Result Conversion : "+notImmutable.getBuilder());
	}
}