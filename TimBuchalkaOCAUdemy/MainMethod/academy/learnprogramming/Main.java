package academy.learnprogramming;


public class Main{

	public static void main(String[] args){
		System.out.println("args-size= " + args.length ); 	// if i gave anything output is 0

		for(int i = 0; i < args.length; i++){
			System.out.println("args[ " + i + " ]="+args[i]);
		}
	}

}