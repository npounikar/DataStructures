package leetcode.string;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Permutation {
	static HashSet<String> combinations = new HashSet<String>();
	static HashSet<String> unique = new HashSet<String>();
	public static void main(String[] args) {
		String input = "aaabcc";
		for(int i=0; i<=input.length()-1; i++)
			unique.add(input.charAt(i)+"");
		permute(input);
		System.out.println("=====");
//		combination(input);
//		System.out.println("=====");
		
//		HashSet<String> set = generatePerm(input);
		Iterator it = combinations.iterator();
		while(it.hasNext()) {
			String x = (String)it.next();
			if(x.length()<=2)
			System.out.print(x+",\n ");
		}

	}

	private static void combination(String input) {
		
		int i = 1;
		while(i<=input.length()) {
			for(int j = 0; j<input.length(); j = j+i) {
				permute(input.substring(j));
			}
			i++;
		}
		
	}

	private static void permute(String input) {
		permute("",input);
	}

	private static void permute(String prefix, String str) {
		
		int n = str.length();
		if(n == 0)
			return;
		else {
			for(int i = 0; i<n; i++) {
				
				
				combinations.add(prefix + str.charAt(i));
				permute(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
			}
		}
	}

	public static HashSet<String> generatePerm(String input)
	{
	    HashSet<String> set = new HashSet<String>();
	    if (input == "")
	        return set;

	    Character a = input.charAt(0);

	    if (input.length() > 1)
	    {
	        input = input.substring(1);

	        HashSet<String> permSet = generatePerm(input);

	        for (String x : permSet)
	        {
	            for (int i = 0; i <= x.length(); i++)
	            {
	                set.add(x.substring(0, i) + a + x.substring(i));
	            }
	        }
	    }
	    else
	    {
	        set.add(a + "");
	    }
	    return set;
	}
}
