package leetcode.tree;

public class BinaryTree {

	Node root;
	
	BinaryTree() {
		root = null;
	}
	
	public boolean isempty() {
		return root == null;
	}
	
	public void push(int data) {
		root = add(root, data);
	}
	
	
	private Node add(Node root, int i) {
		
		if(root == null) 
			root = new Node(i);
		else if(root.left == null)
			root.left = add(root.left, i);
		else if(root.right == null && root.left != null)
			root.right = add(root.right, i);
		
		return root;
		
	}

	public void traverse(Node root) {

		if(root == null) return;

		traverse(root.left);
		System.out.println(root.data);
		traverse(root.right);

	}
	
	public static void main(String[] args) {
		
		BinaryTree bt = new BinaryTree();
		bt.push(6);
		bt.push(3);
		bt.push(4);
		bt.push(7);
		bt.push(9);
		bt.push(0);
		bt.traverse(bt.root);
	}

	


}
