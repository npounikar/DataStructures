package com.amazon.intern;

public class BinarySearch {

	private static void bSearch(int[] arr, int value) {

		int low = 0;
		int high = arr.length-1;
		boolean found = false;
		while(low <= high && !found) {
			int mid = (low+high)/2;
			if(arr[mid] == value) {
				System.out.println("found1");
				found = true;
			} else if (arr[mid] >  value)
				high = mid-1;
			else low = mid + 1;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,4,8,12,20,35,36,40,41,55,99};
		BinarySearch.bSearch(arr,36);
		

	}

}
