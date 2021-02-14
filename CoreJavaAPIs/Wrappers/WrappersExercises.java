
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class WrappersExercises{
	public static void main(String... _1n){
		// boolean   Boolean     new Boolean(true)
		// byte      Byte	 new Byte((byte)1)
		// short     Short	 new Short((short)1)
		// int       Integer     new Integer(1)
		// long      Long        new Long(1L)
		// float     Float       new Float(1.0f)
		// double    Double	 new Double(1.0)
		// char      Character   new Character('c')


		// parseInt convert to Primitive
		// valueOf convert to Wrapper class
		
		int primitive = Integer.parseInt("123");
		System.out.println(primitive);		
		
		Integer wrapper = Integer.valueOf("123");
		System.out.println(wrapper);


		// Integer wrapperThrowsException = Integer.valueOf("123f"); //NumberFormatException 
		//int primitiveThrowsException = Integer.parseInt("123f"); //NumberFormatException
	
		boolean booleanValue = Boolean.parseBoolean("tRuE   "); //false , tRuE => true
		System.out.println(booleanValue);

		//Character, converting String to Primitive (NONE),Converting String to Wrapper Class (NONE)

		
		List<Double> weight = new ArrayList<>();
		weight.add(50.5); //[50.5] //autoboxes the double primitive into a Double object and adds that to the List.
		weight.add(new Double(60)); //[50.5,60.0]
		weight.remove(50.5); //[60.0]  //autoboxes into the wrapper object and passes it to remove()
		double first = weight.get(0); //60.0 //retrieves the Double and unboxes it into a double primitive


		List<Integer> heights = new ArrayList<>();
		heights.add(null);
		//int h = heights.get(0); //NullPointerException

		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.remove(1);
		System.out.println(numbers); //[1]


		List<Integer> numbersValue = new ArrayList<>();
		numbersValue.add(99);
		numbersValue.add(5);
		numbersValue.add(8);
		Collections.sort(numbersValue);
		System.out.println(numbersValue); //[5,8,99]



	}	
}