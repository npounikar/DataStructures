package com.amazon.intern;

public class ReversalArray {

	public static void main(String[] args) {
		int[] arr = {4,8,2,7,1,9};
		rotate(arr, 2);
	}
	
	public static void rotate(int[] arr, int order) {
		order = order % arr.length;
	 
		if (arr == null || order < 0) {
			throw new IllegalArgumentException("Illegal argument!");
		}
	 
		//length of first part
		int a = arr.length - order; 
	 
		reverse(arr, 0, a-1);
		reverse(arr, a, arr.length-1);
		reverse(arr, 0, arr.length-1);
		
		
		for(int i = 0 ; i<arr.length ; i++ ) {
			System.out.println(arr[i]);
		}
	 
	}
	 
	public static void reverse(int[] arr, int left, int right){
		if(arr == null || arr.length == 1) 
			return;
	 
		while(left < right){
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}	
	}

}
