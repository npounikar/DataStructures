package com.amazon.intern;

public class findMin {

	public static void main(String[] args) {
		int[] num = {5,6,7,2,3,4};
		int l = 0, r = num.length-1;
		
		System.out.println(findMin.getMin(num, l, r));
		
	}

	static int getMin(int[] num, int l, int r) {
		int middle = l+(r-l)/2;
		
		if(l == r) 
			return num[l];
		
		if(r-l == 1)
			return Math.min(num[l],num[r]);
		
		if(num[l] < num[r]) {
			return num[l];
		}
		
		else if (num[middle] > num[l])
			return getMin(num,middle,r);

		else 
			return getMin(num,l,middle);
	}

	
	
}
