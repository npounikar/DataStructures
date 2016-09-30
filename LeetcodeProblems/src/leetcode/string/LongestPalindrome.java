package leetcode.string;

public class LongestPalindrome {

	public static void main(String[] args) {
		
		String s = "nannaaaan";
		
		int maxlength = 0, count = 0;
		String longestPalindrome = null;
		
		int len = s.length();
		String[] A = new String[len];
		
		for(int i = 0; i<len; i++) {
			for(int j=i+1 ; j<len ; j++) {
				int length = j - i;
				String curr = s.substring(i, j+1);
					if(isPalindrome(curr)) {
						A[i] = curr;
						if(length > maxlength) {
							maxlength = length;
							longestPalindrome = curr;
						}
						count++;
					}
				
			}
		}
		
	}
	
	
	
	
	public static boolean isPalindrome(String str) {
		
		boolean palindrome = true;
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) != str.charAt(str.length()-1-i))
				palindrome = false;
		}
		
		return palindrome;
	}

}
