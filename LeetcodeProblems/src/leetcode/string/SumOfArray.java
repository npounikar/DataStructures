package leetcode.string;

import java.util.Arrays;

public class SumOfArray {

	public static void main(String[] args) {		
		boolean found = false;
		int[] a = {1,3,8,9,11,13,15};		
		int sum = 20, target = 20;
		Arrays.sort(a);
		
		int i = 0, j = a.length-1;
				
		while(!found && i<=j) {
			int tempSum = a[i]+a[j];
			sum = sum - tempSum;
			for(int k=i+1; k<j; k++) {
				if(a[k] == sum) {
					found = true;
					break;
				}
			}
			
			if(!found) {
				int lSum = a[i+1]+tempSum;
				if(lSum>target) 
					j--;
				else
					i++;
				
			} else
				break;
		}
		
			System.out.println(found);
	}

}
