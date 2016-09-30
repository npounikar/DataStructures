package leetcode.string;

public class MaximumDifferenceInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 90, 10, 110};
        int size = arr.length;
        System.out.println("MaximumDifference is " + 
        		MaximumDifferenceInArray.maxDiff(arr, size));
        
        MaximumDifferenceInArray.divide(4, 0);
   
	}
	
	static int maxDiff(int arr[], int arr_size) 
	    {
	        int max_diff = arr[1] - arr[0];
	        int min_element = arr[0];
	        int i;
	        for (i = 1; i < arr_size; i++) 
	        {
	            if (arr[i] - min_element > max_diff)
	                max_diff = arr[i] - min_element;
	            if (arr[i] < min_element)
	                min_element = arr[i];
	        }
	        return max_diff;
	    }
	
    public static void divide(int a, int b) {
        try {
                int c = a / b;
        } catch (Exception e) {
                System.out.print("Exception ");
        } finally {
                System.out.println("Finally");
        }
    }

}
