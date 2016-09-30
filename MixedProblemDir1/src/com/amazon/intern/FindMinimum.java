package com.amazon.intern;

import java.util.Queue;

public class FindMinimum {

	public static void main(String[] args) {
		int[] num = {22,78,99,99,-1,-1,0,4,6,8};
		int l = 0, r = num.length-1;
		
		System.out.println(FindMinimum.getMin(num, l, r));

	}
	

	static int getMin(int[] num, int l, int r) {
		int middle = l + (r-l)/2;
		
		if(l == r) 
			return num[l];
		
		if(r-l == 1)
			return Math.min(num[l],num[r]);
		
		else if (num[l] < num[r])
			return num[l];
		
		else if (num[r] == num[l])
			return getMin(num,l+1,r);
		
		else if (num[middle] >= num[l])
			return getMin(num,middle,r);

		else 
			return getMin(num,l,middle);
	}

}
