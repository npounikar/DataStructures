package leetcode.string;

public class RotateArray {

	public static void main(String[] args) {
	
		int[] x = {1,2,3,4,5,6,7,8};
		int k = 5;

		int[] result = new int[x.length];
		
		if(k>x.length)
			return;
		
		int j = 0;
		for(int i = k; i<x.length; i++) {
			result[j] = x[i];
			j++;
		}
		
		for(int i = 0; i<k; i++) {
			result[j] = x[i];
			j++;
		}
		
		
		for(int z = 0; z<result.length; z++)
			System.out.print(result[z]+", ");
		
		
		
		System.out.println();
		System.out.println("Inplace ---------");
		int fLen = k;
		reverse(x,0,fLen-1);
		reverse(x,fLen,x.length-1);
		reverse(x,0,x.length-1);
		for(int z = 0; z<x.length; z++)
			System.out.print(x[z]+", ");
		
	}

	private static void reverse(int[] x, int i, int length) {
		
		if(x.length == 1 || x == null)
			return;
		
		while(i<length) {
			int temp = x[i];
			x[i] = x[length];
			x[length] = temp;
			i++;
			length--;
		}
		
	}

}
