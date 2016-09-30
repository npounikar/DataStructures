package com.amazon.intern;

import java.util.Arrays;

public class PointDistance {
	
	
	public static void main(String[] args) {
		Point p;
		int n = 5;
		Double[] dist = new Double[8];
		for(int i = 0; i < 8; i++) {
			p = new Point(i*2, i*3);
		    dist[i] = p.getDistance(p);
		}
		
		Arrays.sort(dist);
		for(int i = 0; i < n; i++) {
		    System.out.println(dist[i]);
		}
		
	}

}
