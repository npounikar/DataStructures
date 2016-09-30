package com.amazon.intern;

public class Point {
	int x;
	int y;
	double distance;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistance(Point p) {
		
		distance = (double)Math.sqrt((p.x*p.x)+(p.y*p.y));
		
		return distance;
	}
	
}
