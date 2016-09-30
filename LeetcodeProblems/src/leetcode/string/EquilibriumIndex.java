package leetcode.string;

public class EquilibriumIndex {

	public static void main(String[] args) {
		
		int[] a = {1, 3, -4, 5, 1, -6, 2, 1};
		System.out.println(findEquiIndex(a));

	}

	private static int findEquiIndex(int[] a) {
		int sum = 0;
		for(int i = 0; i<a.length; i++)
			sum += a[i];
		
		if(sum == 0)
			return a.length;
		
		int left = 0, right = 0;
		for(int j = 1; j < a.length; j++) {
			int index = j; 
			
			right = sum - left - a[index];
			if(right == left)
				return index;
			
			right+=a[index];
			left = sum - right;
			
		}
		return -1;
	}

}
