package leetcode.tree;

public class TreeTraversals {

	Node root;

	TreeTraversals() {
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

		TreeTraversals bst = new TreeTraversals();

		//from : https://dzone.com/articles/java-how-create-binary-search
		int arr[] = {20, 15, 200, 25, -5, 0, 100, 20, 12, 126, 1000, -150};
		
		for(int i = 0; i<arr.length; i++)
			bst.add(arr[i]);
			
		System.out.println("\nPRE");
		bst.preOrderTraversal(bst.root);
		System.out.println("\nIN");
		bst.inOrderTraversal(bst.root);
		System.out.println("\nPOST");
		bst.postOrderTraversal(bst.root);

	}


	void preOrderTraversal(Node root) {
		if(root == null) return;
		System.out.print(root.data+", ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	void inOrderTraversal(Node root) {
		if(root == null) return;
		inOrderTraversal(root.left);
		System.out.print(root.data+", ");
		inOrderTraversal(root.right);
	}
	void postOrderTraversal(Node root) {
		if(root == null) return;
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(root.data+", ");
	}

}
