package leetcode.string;

import java.util.HashSet;

public class OddManOut {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,1,2,3,4};
		oddManOut(arr);
		usingXOR(arr);
	}

	private static void oddManOut(int[] arr) {
		int sum = 0;
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0; i<arr.length; i++) {
			if(!set.contains(arr[i])) {
				set.add(arr[i]);
				sum = sum + arr[i];
			} else {
				sum = sum - arr[i];
			}
		}
		
		System.out.println(sum);
	}
	
	
	
	private static void usingXOR(int[] arr) {
		int val = 0;
		
		for(int i=0; i<arr.length; i++) 
			val = val ^ arr[i];
		
		System.out.println(val);
	}
	
}
