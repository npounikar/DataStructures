package com.amazon.intern;

public class BSTTraversal {

	BSTNode root;
	
	BSTTraversal() {
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
		
		else if(root.getData() <= data)
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
	
	void preOrderTraversal(BSTNode root) {
		
		if(root == null) return;
		
		System.out.println(root.getData());
		preOrderTraversal(root.leftChild);
		preOrderTraversal(root.rightChild);
		
	}
	
	void postOrderTraversal(BSTNode root) {

		if(root == null)return;


		postOrderTraversal(root.leftChild);
		postOrderTraversal(root.rightChild);
		System.out.println(root.getData());

	}

	void inOrderTraversal(BSTNode root) {

		if(root == null) return;

		inOrderTraversal(root.leftChild);
		System.out.println(root.getData());
		inOrderTraversal(root.rightChild);

	}

	
	public static void main(String[] args) {
			
		BSTTraversal bst = new BSTTraversal();
				
		bst.add(5);
		bst.add(2);
		bst.add(8);
		bst.add(-4);
		bst.add(18);
		bst.add(7);
		bst.inOrderTraversal(bst.root);
		System.out.println(bst.search(8));
//		bst.postOrderTraversal(bst.root);
//		System.out.println(bst.search(8));
//		bst.inOrderTraversal(bst.root);
//		System.out.println(bst.search(8));

	}

}
