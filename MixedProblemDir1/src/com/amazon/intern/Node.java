package com.amazon.intern;

public class Node {
	
	public int data;
	public Node next;
	
	Node() {
		next = null;
	}
	
	Node(int data) {
		this.data = data;
		next = null;
	}

	public int getData(){
		return data;
	}
}
