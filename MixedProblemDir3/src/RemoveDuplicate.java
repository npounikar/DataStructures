import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class RemoveDuplicate {

	public static void main(String[] args) {
		
		int arr[] = {1,3,4,2,3,4,3,4,4};
		
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		HashMap<Integer, Boolean> dup = new HashMap<Integer, Boolean>();
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], true);
			}
			else {
				if(!dup.containsKey(arr[i])) {
					dup.put(arr[i], true);
				}
			}
		}
		
		Iterator it = map.entrySet().iterator();
		System.out.println("Array after removal of duplicates");
		while(it.hasNext()) {
			 Map.Entry<Integer, Boolean> pair = (Entry<Integer, Boolean>) it.next();
			 System.out.println(pair.getKey());
		}
			
		System.out.println("Duplicates");
		Iterator it1 = dup.entrySet().iterator();
		while(it1.hasNext()) {
			 Map.Entry<Integer, Boolean> pair1 = (Entry<Integer, Boolean>) it1.next();
			 System.out.println(pair1.getKey());
		}
	}

}
