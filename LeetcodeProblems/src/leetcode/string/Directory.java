package leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class Directory {

	List<Integer> level = new ArrayList<Integer>();

	public int getLength(String string) {
		
		if(string == null)
			return 0;
		
		int len = 0;
		String[] dom = string.split("\n");
		for(int i = 0 ; i < dom.length; i++) {
			
			int lengthOfDirectory = dom[i].trim().length();
			int currentDirectorySpaceCount = dom[i].length()-lengthOfDirectory;
			
			if(!dom[i].contains("."))
				setLevel(lengthOfDirectory+1, currentDirectorySpaceCount);
			else  if(dom[i].contains("jpeg")||dom[i].contains("gif")||dom[i].contains("png"))
				len = len + level.get(currentDirectorySpaceCount-1)+lengthOfDirectory+1;
			
		}
		return len;
		
	}


	private void setLevel(int count, int currentDirectorySpaceCount) {
		
		int previousCount=0;
		if(currentDirectorySpaceCount>0)
			previousCount = level.get(currentDirectorySpaceCount-1);
		
		if(level.size() <= currentDirectorySpaceCount)
			level.add(previousCount+count);
		else
			level.set(currentDirectorySpaceCount, previousCount+count);
		
	}
	
	

}
