package com.amazon.intern;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class FullHouse {
static int a[] = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
static void findFull(int k)
{   int z = a[k-1];
	a[k-1] = z+1;
}
public static void main(String args[])
{   int count = 0;
	findFull(3);
	findFull(3); 
	findFull(3); 
	findFull(3); 
	findFull(1); 

	for(int i = 0;i<a.length-1;i++)
	{
		if(a[i]!=-1)
		count = count+a[i];	
	}
	if(count == 3)
		System.out.println("Full House");
	else
		System.out.println("No luck this time");
	
	char c = 'C';
	System.out.println((int)c);
	System.out.println(c-0);
	
	//----------------------------------------------------Odd no. of -----------------------------------------
	
	int[] A = {1,2,3,1,2,3,1,2,3,1,4};
	HashMap<Integer,Boolean> map = new HashMap<Integer, Boolean>();
	for(int i=0;i<A.length;i++){
		if(!map.containsKey(A[i]))
			map.put(A[i], true);
		else if(map.containsKey(A[i])) {
			if(map.get(A[i]))
				map.replace(A[i], false);
			else
				map.replace(A[i], true);
				
		}
			
	}
	
	Iterator it = map.entrySet().iterator();
	
	while(it.hasNext()) {
		Map.Entry pair = (Map.Entry)it.next();
		
			System.out.println(pair.getKey());
			System.out.println(pair.getValue());
			
	}
	
	//--------------------------------removing the duplicates------------------------------------------------------------
	
	
	HashSet<Integer> set = new HashSet<Integer>();
	for(int i=0;i<A.length;i++){
		if(!set.contains(A[i]))
			set.add(A[i]);		
			
	}
	
	Iterator it1 = set.iterator();
	
	
	while(it1.hasNext()) {
			System.out.println(it1.next());
			
	}
	

}
}