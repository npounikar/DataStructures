import java.util.ArrayList;


public class StringPalindrome {

	public static void main(String[] args) {
		String str = "HEYABBA";
		String sub = "";
		int len = str.length();
		int index = 1;
		
		
		for(int i = 0 ; i < len ; i++) {
			sub = str.substring(i,i+index );
			 	if(index+i == len) {
			 		index++;
			 		i = -1;
			 	}
			 	
			 boolean palindrome = StringPalindrome.checkPalindrome(sub);
			 if(palindrome)
				 System.out.println("Palindrome = "+sub);
				
		}
	}

	

	private static boolean checkPalindrome(String sub) {
		int i = 0;
		String a="";
		
		for(i = sub.length(); i > 0 ; i--) {
			a += sub.charAt(i-1);
		}

		if(sub.equals(a)) 
			return true;			
		else
			return false;
	}

}
