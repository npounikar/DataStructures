package leetcode.tree;


public class BinarySearchTree {

    Node root;
	
    BinarySearchTree() {
		root  = null;
	}
	
	public boolean isempty() {
		return root == null;
	}
	
	public void add(int data) {
		root = add(root, data);
	}
	
	public Node add(Node root, int data) {
		
		if(root == null)
			root = new Node(data);
		
		else if(root.data > data)
			root.left = add(root.left, data);
		
		else if(root.data <= data)
			root.right = add(root.right, data);
		
		return root;
	}
	
	public static void main(String[] args) {
			
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.add(5);
		bst.add(2);
		bst.add(8);
		bst.add(-4);
		bst.add(18);
		bst.add(7);
		bst.inOrderTraversal(bst.root);

	}
	
	
	
	public void inOrderTraversal(Node root) {
		if(root == null) return;
		inOrderTraversal(root.left);
		System.out.println(root.data);
		inOrderTraversal(root.right);
	}


}
