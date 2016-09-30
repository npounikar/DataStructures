package com.amazon.intern;

public class Dir {

	public static void main(String[] args) {
		String stream = "dir1\n abc.k\n abc.l\n abc.jpg\n dir11\n  fob.k\n  lmn.jpg\ndir2\n lmt.jpg";
		char[] streamChars = stream.toCharArray();
		for(int i = 0 ; i < streamChars.length; i++) {
			System.out.print(streamChars[i]);
			
		}
		
		
	}

}
