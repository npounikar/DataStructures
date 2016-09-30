package com.amazon.intern;

public class BinarySearchTree {

	BSTNode root;
	
	BinarySearchTree() {
		root  = null;
	}
	
	public boolean isempty() {
		return root == null;
	}
	
	public void add(int data) {
		root = add(root, data);
	}
	
	public BSTNode add(BSTNode root, int data) {
		
		if(root == null)
			root = new BSTNode(data);
		
		else if(root.getData() > data)
			root.leftChild = add(root.leftChild, data);
		
		else if(root.getData() < data)
			root.rightChild = add(root.rightChild, data);
		
		return root;
	}
	
	
	public boolean search(int value) {
		return search(root, value);
	}
	
	public boolean search(BSTNode node, int x) {
		
		boolean found = false;
		while((node!=null) && !found) {
			if(node.getData() > x)
				node = node.leftChild;
			else if(node.getData() < x)
				node = node.rightChild;
			else {
				found = true;
				break;
			}
			//found = search(node,x);
		}
	
		return found;
	}
	
	
	public static void main(String[] args) {
			
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(5);
		bst.add(2);
		bst.add(8);
		bst.add(-4);
		bst.add(18);
		bst.add(7);
		
		System.out.println(bst.search(8));

	}

	

	

}
