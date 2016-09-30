import java.util.Arrays;


public class Demo5 {

	public static void main(String[] args) {
		
		int[] A = {0,3,6,2,4};
		int[] B = {7,8,3,1};
		Arrays.sort(A);
		Arrays.sort(B);
		
		int res = findCommmonMinimum(A,B);
		System.out.println(res);
	}

	private static int findCommmonMinimum(int[] A, int[] B) {
		
		
		int a = A.length;
		int b = B.length;
		int arr[] = new int[a+b];
		int i=0,j=0,k=0;
		
		while (i<a && j<b)
		{
		    if(A[i] == B[j])
		    {
		    arr[k++]=A[i];    
		      i++;
		      j++;
		    }
		    else if(A[i]<B[j])
		     i++;
		    else
		     j++; 
		}
		return arr[0];
	}

}
