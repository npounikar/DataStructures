
public class Demo6 {

	public static void main(String[] args) {
		int[] A = {0,1,1,1,0,0,0,1,1,1,1,1,1,1,1};
		int x = Demo6.solution(A);
		System.out.println(x);
		
	}
	
	public static int solution(int[] A) {
		    int n = A.length; //15
	        int i = n -1;    //14
	        int result = -1;
	        int k = 0, maximal = 0;
	        while (i > 0) {
	        	System.out.println("---"+A[i]);
	            if (A[i] == 1) {
	                k = k + 1;
	                System.out.println(k);
	                if (k >= maximal) {
	                    maximal = k;
	                    result = i;
	                }
	            }
	            else
	                k = 0;
	            i = i - 1;
	            System.out.println("result : "+result);
	            System.out.println("max : "+maximal);
	        }
	        if (A[i] == 1 && k + 1 < maximal)
	            maximal = 0;
	        return maximal;
		}
}
