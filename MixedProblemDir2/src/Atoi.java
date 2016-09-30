
public class Atoi {

	public static void main(String[] args) {
		String str = "12345";
		performAtoi(str);

	}
	
	public static void performAtoi(String a) {
	
		    int res = 0; // Initialize result
		    char ch[] = a.toCharArray();
		    
		    // Iterate through all characters of input string and update result
		    for (int i = 0; i<ch.length ; i++) {
		    	System.out.println(ch[i]);
		    	res = res*10 + ch[i] - '0';
		    	System.out.println("res : "+res);
			}
		    // return result.
		    System.out.println(res);
		}
	}


