import java.util.Arrays;


public class ClosestPair {
	
	public static void main(String args[]) {
		
		int[] arr = {9,4,5,2,4,1};
		Arrays.sort(arr);
		
		int min = Integer.MAX_VALUE;
		int val1 =0, val2 = 0;
		
		for(int i = 1 ; i < arr.length; i++){
			if(arr[i] - arr[i-1] < min) {
				min = arr[i] - arr[i-1];
				val1 = arr[i];
				val2 = arr[i-1];
			}
		}
		
		System.out.println("value1 : "+val1+" - value2 : "+val2+" are the closest pair and the difference is = "+min);
		
	}

}
