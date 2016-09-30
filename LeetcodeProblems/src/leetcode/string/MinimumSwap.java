package leetcode.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MinimumSwap {

	public static void main(String[] args) {
		
		int[] pairs = {1,2,3,4,5,6};
		int[] arr = {3,1,5,6,2,4};

		HashMap<Integer, Integer> map = new HashMap();
		for(int i= 0; i<pairs.length-1; i=i+2) {
			map.put(pairs[i], pairs[i+1]);
			map.put(pairs[i+1], pairs[i]);
		}
//		
//		Iterator it = map.entrySet().iterator();
//		while(it.hasNext()) {
//			Entry pair = (Entry)it.next();
//			System.out.println(pair.getKey() +", "+pair.getValue());
//		}
//		
		System.out.println(getMinimumSwapNumber(map, arr));
	}
	
	

	private static double getMinimumSwapNumber(HashMap<Integer, Integer> map, int[] arr) {
		
		double swapCount = 0;
		if(arr.length<=1)
			return 0;
		else {
			int i= 0;
			while(i<arr.length-1) {
				if(arr[i] == map.get(arr[i+1]) && arr[i+1] == map.get(arr[i])) {
					i += 2;
				} else {
					swapCount++;
					i++;
				}
				
			}
			 
			return Math.floor(swapCount/2);
		}
	}

}
