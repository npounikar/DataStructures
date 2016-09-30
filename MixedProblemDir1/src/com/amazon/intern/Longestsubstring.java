package com.amazon.intern;

import java.util.HashMap;

public class Longestsubstring {

	public static void main(String[] args) {
		String s = "abcdefbgzxc";
		char[] arr = s.toCharArray();
		int pre = 0;
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < arr.length; i ++) {
			if(!map.containsKey(arr[i]))
				map.put(arr[i], i);
			
			else {
				pre = Math.max(pre, map.size());
				i = map.size() - i + 1;
				map.clear();
			}
		}
		System.out.println(Math.max(pre, map.size()));
	}

}
