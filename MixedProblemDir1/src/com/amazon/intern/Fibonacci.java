package com.amazon.intern;

public class Fibonacci {

	public static void main(String[] args) {
		
		//space optimized method ---
		int num1 = 0, num2 = 1, sum = 0 , n = 10;
		
		
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		
		if( n > 2) {
			for(int i = 0; i<n-1 ; i++) {
				sum = num2 + num1;
				num1 = num2;
				num2 = sum;
				System.out.print(sum + " ");	
			}
		}

		/*--------------------------------------------------------------------------------------------
		 * 
		 * 
		 */
		System.out.println("--------------------------------------------------------------------------");
		System.out.println(fib(n));

		System.out.println("--------------------------------------------------------------------------");
		System.out.println(fib(n,0));
		
		
		
	}

	private static int fib(int n) {
		
		if(n<=1)
			return n;
		return fib(n-1) +  fib(n-2);
	}
	
	

	/*--------------------------------------------------------------------------------------------
	 * 
	 * 
	 */
	
	static int fib(int n, int k)
	{
	  /* Declare an array to store fibonacci numbers. */
	  int[] f = new int[n+1];
	  int i;
	 
	  /* 0th and 1st number of the series are 0 and 1*/
	  f[0] = 0;
	  f[1] = 1;
	 
	  for (i = 2; i <= n; i++)
	  {
	      /* Add the previous 2 numbers in the series
	         and store it */
	      f[i] = f[i-1] + f[i-2];
	  }
	 
	  return f[n];
	}
	
}
