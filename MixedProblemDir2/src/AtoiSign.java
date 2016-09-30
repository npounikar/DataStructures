

public class AtoiSign {

	public static void main(String[] args) {
		String str = "-823456";
		performAtoi(str);

	}
	
	public static void performAtoi(String a) {
	
		    int res = 0; // Initialize result
		    int sign = 1, i = 0;
		    char ch[] = a.toCharArray();
		    
		    if (ch[0] == '-') {
		        sign = -1;  
		        i++;  // Also update index of first digit
		    }
		    
		    // Iterate through all characters of input string and update result
		    for (; i<ch.length ; i++) {
		    	System.out.println(ch[i]);
		    	res = res*10 + ch[i] - '0';
		    	System.out.println("res-"+res);
			}
		    // return result.
		    System.out.println(sign*res);
	}
}



