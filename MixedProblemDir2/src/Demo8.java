
public class Demo8 {

	public static void main(String[] args) {
		 int N = 9736;
		 System.out.println(Demo8.solution(N));
	}
	
	   static int solution(int N) {
	        int largest = 0;
	        int shift = 0;
	        int temp = N;
	        for (int i = 1; i <= 30; ++i) {
	            int index = (temp & 1);
	            temp = ((temp >> 1) | (index << 29));
	            if (temp > largest) {
	                largest = temp;
	                shift = i;
	                System.out.println(temp);
	            }
	        }
	        return shift;
	    }
}
