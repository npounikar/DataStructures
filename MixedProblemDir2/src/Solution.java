import java.util.HashSet;

class Solution {
	public static void main(String[] args) {
	
	    int arr[] = { 1,2,3,4,5,2,3,4,6 };

	    HashSet<Integer> aset = new HashSet<Integer>();

	    System.out.println("length of Array:" + arr.length);

	    for (int i : arr) {
	        aset.add(i);
	    }
	    System.out.println(aset);
	}
		
}
    
    