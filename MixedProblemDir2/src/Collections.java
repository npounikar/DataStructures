import java.util.List;
import java.util.ArrayList;


public class Collections {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(40);
		numbers.add(400);
		numbers.add(4000);
		numbers.add(40000);
		
		System.out.println(numbers.get(0));
		System.out.println("--------------------iterations 1------------------");
		for(int i=0; i<numbers.size() ; i++) {
			System.out.println(numbers.get(i));
		}
		
		// this is slow since it shifts all the other elements.
		numbers.remove(0);
		
		System.out.println("--------------------iterations 2------------------");
		for(Integer value: numbers) {
			System.out.println(value);
		}
		
		// List interface ...
		List<String> values = new ArrayList<String>();
	}
	
}
