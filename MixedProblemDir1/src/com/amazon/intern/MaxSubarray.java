package com.amazon.intern;

public class MaxSubarray {

	public static void main(String[] args) {
		
		int[] A = {1,2,3,-4,5,6,-7};
		
		int newsum = A[0];
		int max = A[0];
		
		for(int i=1; i<A.length;i++) {
			newsum = Math.max(A[i]+newsum, A[i]);
			max = Math.max(max, newsum);
		}
		
		System.out.println(max);

	}

}
