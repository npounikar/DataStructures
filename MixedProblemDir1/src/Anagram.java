import java.util.HashMap;
import java.util.Map;


public class Anagram {

	public static void main(String[] args) {
		
		String[] words = {"car", "cheating", "dale", "deal", "lead", "listen", "silent", "teaching"};
		String s1 = words[2], s2 = words[4];
		System.out.println(isAnagram(s1, s2));
	}

	
	public static boolean isAnagram(String s1, String s2) {
		char[] word1 = s1.toCharArray();
		char[] word2 = s2.toCharArray();

		Map<Character, Integer> lettersInWord1 = new HashMap<Character, Integer>();

		for (char c : word1) {
		    int count = 1;
		    if (lettersInWord1.containsKey(c)) {
		        count = lettersInWord1.get(c) + 1;
		    }
		    lettersInWord1.put(c, count);
		}

		for (char c : word2) {
		    int count = -1;
		    if (lettersInWord1.containsKey(c)) {
		        count = lettersInWord1.get(c) - 1;
		    }
		    lettersInWord1.put(c, count);
		}

		for (char c : lettersInWord1.keySet()) {
		    if (lettersInWord1.get(c) != 0) {
		        return false;
		    }
		}

		return true;
	}

}
