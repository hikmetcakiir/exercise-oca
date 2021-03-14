
import java.util.ArrayList;
import java.util.List;

public class ArrayListExercises{
	public static void main(String... $n){
		ArrayList listOne = new ArrayList();
		ArrayList listTwo = new ArrayList(10); // a specific number of slots
		ArrayList listThree = new ArrayList(listTwo);
		
 		System.out.println(listOne);



		ArrayList<String> listFour = new ArrayList<String>();
		ArrayList<String> listSix = new ArrayList<>();

		List<String> listSeven = new ArrayList<>();
		//ArrayList<String> listEight = new List<>(); //List is abstract: cannot be instantiated
		
		ArrayList list = new ArrayList();
		list.add("elephant"); //[elephant]
		list.add(Boolean.TRUE); //TRuE true error
		System.out.println(list);


		List<String> birds = new ArrayList<>();
		birds.add("hawk"); // [hawk]
		birds.add(1,"robin"); // [hawk,robin]
		birds.add(0,"blue jay"); // [blue jay,hawk,robin]
		birds.add(1,"cardinal");
		System.out.println(birds); // [blue jay, cardinal, hawk, robin]

		birds.clear();
		if(birds.isEmpty()){
			System.out.println("Array is empty");
		}else{
			System.out.println("Array is not empty");
		}

		System.out.println(birds.contains("hawk")); // true if we say hawK , it is false
		
		
	}	
}