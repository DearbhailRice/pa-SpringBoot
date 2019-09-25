import java.util.ArrayList;

/**
 * 
 * @author ric19171870
 *
 */
public class Examples {

	
	public static void main(String [] args) {
		getArrayList();
		
	}
	
	
	public static void getArrayList() {
		ArrayList <String> words = new ArrayList <String>();
		words.add("one");
		words.add("two");
		words.add("Three");
		
		System.out.println("Array list standard for loop");
		for (int loop =0; loop<words.size();loop++) {
			
			System.out.println(words.get(loop));
		}
		
		System.out.println("Array list enhanced for loop");
		for (String nums: words ) {
			System.out.println(nums);
		}
		
	}

}
