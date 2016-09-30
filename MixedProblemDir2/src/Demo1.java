
public class Demo1 {

	public static void main(String[] args) {
		int A[] = {1,3,5,7,9};
		int B[] = {0,2,4,6};
		
		int m = A.length;
		int n = B.length;
		
		int C[] = new int[m+n];
		
		int i = 0,j = 0,k = 0,median=0;
		while( i < m && j < n) {
			if(A[i] < B[j]) {
				C[k] = A[i];
				i++;
				k++;
			}
			if(A[i] > B[j]) {
				C[k] = B[j];
				j++;
				k++;
			}
		}
		while (i < m) {
			C[k] = A[i];
			i++;
			k++;
		}
		while (j < n) {
			C[k] = B[j];
			i++;
			k++;
		}
		
		if((m+n)%2 == 0)
			 median = (C[(m+n)/2]+C[((m+n)/2)+1])/2;
		else
			 median = C[(m+n)/2];
		
		System.out.println(median);
		
	}
	
}
