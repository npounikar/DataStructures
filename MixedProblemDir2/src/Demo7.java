import java.util.Arrays;


public class Demo7 {

	public static void main(String[] args) {
		int A[] = {10,0,8,2,-1,12,11,3};
		System.out.println(Demo7.gap(A));
	}
	public static int gap(int[] arr){
		
		Arrays.sort(arr);
		int gap=0;
		
		for(int i=0;i<arr.length-1;i++){
			if(Math.abs(arr[i]-arr[i+1])>gap){
				gap = Math.abs(arr[i]-arr[i+1]) ;

			}

		}
		System.out.println(gap);
		if(gap%2!=0)
			return (gap-1)/2;
		else return gap/2;
		
	}
}
