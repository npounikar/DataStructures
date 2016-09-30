package com.amazon.intern;
import java.util.*;
class GodaddyNextHighestString
{
	public static void main(String args[])
	{
		GodaddyNextHighestString obj = new GodaddyNextHighestString();
		System.out.println(nextHighest("1234"));
	}
	static String nextHighest(String word)
	{
		if(word.length()==0 || word.length()==1)
			return "no answer";
		char myArr[] = word.toCharArray();
		int swapIndex = -1;
		int nextMaxIndex = 0;
		for(int i=myArr.length-2; i>=0; i--)
		{
			if(myArr[i+1]>myArr[i])
			{
				nextMaxIndex = i+1;
				swapIndex = 0;
				break;
			}
		}
		if(swapIndex == -1)
			return "no answer";
		int n = nextMaxIndex;
		for(int j = nextMaxIndex;j<myArr.length;j++) {
			if(myArr[j]<myArr[n] && myArr[j]>myArr[nextMaxIndex-1]) {
				n = j;
			}
		}
		char temp = myArr[n];
		myArr[n] = myArr[nextMaxIndex-1];
		myArr[nextMaxIndex-1] = temp;
		
		
		
		char aftrArr[] = new char[myArr.length+1 - nextMaxIndex];
		for(int i=0; i<aftrArr.length; i++)
		{
			aftrArr[i] = myArr[myArr.length - 1-i];
		}
		for(int i=0;i<aftrArr.length; i++)
		{
			myArr[nextMaxIndex+i] = aftrArr[i];
		}
		return new String(myArr);
	}
}