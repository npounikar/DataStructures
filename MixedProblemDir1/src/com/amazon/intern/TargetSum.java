package com.amazon.intern;

import java.util.Arrays;

public class TargetSum {

	public static void main(String[] args) {
		
		int[] a = {5,6,7,9,3,5,1,4};
		int target = 10;
		
		Arrays.sort(a);
		
		int i = 0, j = a.length-1;
		while(i<j) {
			if(a[i]+a[j] == target) {
				System.out.println(a[i] +" + "+a[j]+" = "+target);
				i++;
				j--;
			} else if(a[i]+a[j] > target) {
				j--;
			} else if(a[i]+a[j] < target) {
				i++;
			}
			
		}

	}

}
