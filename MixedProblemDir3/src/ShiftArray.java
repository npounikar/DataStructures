
public class ShiftArray {

	public static void main(String[] args) {
		
		int[] arr1 = {5,6,5,6,1,5,6,9,4,2,3,1};
		int[] arr2 = {5,6,9,4,2,3,1,5,6,5,6,1};
		
		int count = 0, i = 0, j = 0 ;
		while(i < arr1.length - 1) {
			if(arr1[i] == arr2[j] && arr1[i+1] == arr2[j+1]) {
				count++;
				i++;
				j++;
			}
			else {
				count = 0;
				i++;
				j=0;
				
			}
			
			
		}
		
		count++;
		System.out.println("shifted by "+count+" places");
	}

}
