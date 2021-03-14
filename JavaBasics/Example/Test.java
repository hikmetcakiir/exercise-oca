package Example;

import static java.util.Arrays.asList;
import java.util.List;
import java.util.ArrayList;

public class Test{
	static public void main(String... $n){
		List<String> country = asList("TURKEY", "USA", "GERMANY", "FRANCE");
		String value = findScrOrd("TURKEY2",country);	
		System.out.println(value);
	}
  	private static String findScrOrd(String val,List<String> country ){
    		return country.stream().filter(e -> (val.equals(e))).findFirst().get();
  	}
}

 