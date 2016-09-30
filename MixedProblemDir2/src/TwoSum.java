
public class TwoSum {

	public static void main(String[] args) {

		int target = 7;
		int[] array = {0,1,6,8,0};
		int[] res = twoSum(array,target);
		System.out.println("index1="+res[0]+ " , index2="+res[1]);

	}


    public static int[] twoSum(int[] numbers, int target) {
        int[] result = {0,0};
        for(int i=0; i<numbers.length-1; i++) {
        		
                if(numbers[i]+numbers[i+1] == target) {
                   result[0] = i;
                   result[1] = i+1;
                } else 
                	continue;
        }
        return result;
    }
}
