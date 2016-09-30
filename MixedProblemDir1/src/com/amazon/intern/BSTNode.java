package com.amazon.intern;

public class BSTNode {
	
	int data;
	BSTNode rightChild;
	BSTNode leftChild;
	
	public BSTNode() {
		leftChild = null;
		rightChild = null;
		data = 0;
	}
	
	public BSTNode(int data) {
		leftChild = null;
		rightChild = null;
		this.data = data;
	}

	public int getData() {
		return this.data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	

}
