package com.amazon.intern;

import java.util.*;

public class ObjectFreq {
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		ArrayList<Character> obj = new ArrayList<Character>();
		obj.add('c');
		obj.add('v');
		obj.add('a');
		obj.add('y');
		obj.add('c');
		obj.add('c');
		obj.add('a');
		obj.add('a');
		obj.add('c');
	
	
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int count = 0;
		int max = 0;
		for (int i = 0; i < obj.size(); i ++) {
			if(!map.containsKey(obj.get(i))) {
				map.put(obj.get(i),1);
			}
			else {
				Iterator it = map.entrySet().iterator();
				while(it.hasNext()) {
					Map.Entry pair = (Map.Entry)it.next();
					if(pair.getKey() == obj.get(i)) {
						count = (int)pair.getValue();
						map.replace(obj.get(i), count + 1);
						max = Math.max((int)pair.getValue(),max);
					}
				}
			}
		}

	
		Iterator it2 = map.entrySet().iterator();
		while(it2.hasNext()) {
			Map.Entry pair = (Map.Entry)it2.next();
			if((int)pair.getValue() == max) {
				System.out.println(pair.getKey());
				System.out.println(max);
			}
		}
	}

	
}
