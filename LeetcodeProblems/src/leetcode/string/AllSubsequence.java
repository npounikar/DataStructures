package leetcode.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AllSubsequence {

	
	 public static List<String> combinations(String suffix,String prefix, List<String> set){
	        if(prefix.length()<0 && prefix.equals(""))return null;
	        set.add(suffix);
	        for(int i=0;i<prefix.length();i++)
	         combinations(suffix+prefix.charAt(i), prefix.substring(i+1,prefix.length()), set);
	        
	        return set;
	    }

	    public static void main (String args[]){
	    	List<String> list = new ArrayList<String>();
	    	List<String> result = combinations("","123", list);
	        Collections.sort(result);
	        HashSet<String> set = new HashSet<String>(list);
	        Iterator it = set.iterator();
	        while(it.hasNext())
	        	System.out.println(it.next());
	        
	        System.out.println(set.size());
	        
	    }
}
