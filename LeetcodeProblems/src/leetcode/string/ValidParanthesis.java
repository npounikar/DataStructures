package leetcode.string;

import java.util.HashMap;
import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
		String input = "[])";
		System.out.println(isBalanced(input));
		
	}

	
	private static boolean isBalanced(String str) {
		
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('[',']');
		map.put('(',')');
		map.put('{','}');
		
		if(str == null)
			return false;
		if(str.length() == 0)
			return false;
		if(str.length()%2 != 0)
			return false;
		
		Stack<Character> brackets = new Stack<Character>();
		for(int i=0; i<str.length(); i++) {
			if(map.containsKey(str.charAt(i)))
				brackets.push(str.charAt(i));
			else if(str.charAt(i) != map.get(brackets.pop()))
					return false;

			}

		return true;
	}

}
