package com.amazon.intern;

public class LongestPalindromeString {

	public static void main(String[] args) {
		String s = "abbaghjncn";
		System.out.println(findLongestPalindrome(s));

	}

	private static int findLongestPalindrome(String s) {
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
		
		System.out.println(longestPalindrome);
		for (int i = 0; i < len-1; i++) {
			if(A[i] != null)
			System.out.println(A[i]);
			}
		return count;
		}
		

	private static boolean isPalindrome(String s) {

		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}
