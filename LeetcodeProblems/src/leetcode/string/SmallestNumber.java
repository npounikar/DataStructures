package leetcode.string;

public class SmallestNumber {

	public static void main(String[] args) {

		String x = Integer.toString(4829401);
		int minimum = Integer.MAX_VALUE;
		
		for(int i = 0; i<x.length()-1; i++) {
			
			int minIndex = i;
			int first = Integer.valueOf(x.charAt(i));
			String bfr = "";
			if(minIndex != 0)
				bfr = x.substring(0,minIndex);

			int maxIndex = i+1;
			int second = Integer.valueOf(x.charAt(i+1));
			String aftr = x.substring(maxIndex, x.length());
			
			
			if(first>second) {
				maxIndex = i;
				minIndex = i+1;
				bfr = x.substring(0,maxIndex+1);
				aftr = x.substring(minIndex+1, x.length());
			} 
			
			int number = Integer.valueOf(bfr+aftr);
			if(number<minimum)
				minimum = number;

		}
		
		System.out.println("MIN : "+minimum);
	}

}
