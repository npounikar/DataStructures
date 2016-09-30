package leetcode.tree;

public class Node {
	
	int data;
	Node right, left;
	
	Node(int data, Node right, Node left) {
		this.data = data;
		this.right = right;
		this.left = left;
	}
	
	Node(int data) {
		this.data = data;
		this.right = null;
		this.left = null;
	}

}
