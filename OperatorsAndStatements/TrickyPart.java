
public class TrickyPart{
	
	public static void main(String... args){
		/*
		boolean allow = false;
		if (allow = true)
			System.out.println("value is true");
		else
			System.out.println("value is false");
		*/
		/*
		int score = 110;
		if (score > 200)
			if (score < 400)
				if(score > 300)
					System.out.println(1);
				else
					System.out.println(2);
		else
			System.out.println(3);
		*/
		
		/*
		int score = 110;
		if (score > 200){
			if(score < 400)
				if(score > 300)
					System.out.println(1);
		}
		else
			System.out.println(2);
		*/
		
		int score = 110;
		if (score > 200)
		if (score < 400)
		if (score > 300)
			System.out.println(1);
		else
			System.out.println(2);
		else
			System.out.println(3);
	}

}