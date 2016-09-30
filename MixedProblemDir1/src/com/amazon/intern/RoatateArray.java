package com.amazon.intern;

public class RoatateArray {

	public static void main(String[] args) {
		int[] arr = {4,8,2,7,1,9};
		RoatateArray.rotate(arr, 1);
	}
	
	public static void rotate(int arr[],int order) {

		int[]  out = new int[arr.length];
		
		if(order > arr.length)
			order = order%arr.length;
		

		for(int i = 0 ; i<order ; i++ ) {
			out[i] = arr[arr.length-order+i];
		}
		
		int j = 0;
		for(int i = order ; i<arr.length ; i++ ) {
			out[i] = arr[j];
			j++;
		}
		
		for(int i = 0 ; i<arr.length ; i++ ) {
			System.out.println(out[i]);
		}
		
		System.arraycopy(out, 0, arr, 0, arr.length);

	}

}
