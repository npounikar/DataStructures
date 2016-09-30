package leetcode.string;

public class ConcatPalindrome {

	public static void main(String[] args) {

		String[] input = {"hello", "lleh", "olleh", "cat", "ttac"};
		ConcatPalindrome cp = new ConcatPalindrome();
		cp.findPalindrome(input);

	}

	private void findPalindrome(String[] input) {
		
		for(int i = 0; i<input.length; i++) {
			System.out.println(input[i]);
		}

	}
}
