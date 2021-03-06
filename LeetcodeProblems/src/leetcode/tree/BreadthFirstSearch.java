package leetcode.tree;

public class BreadthFirstSearch {

	Node root;

	BreadthFirstSearch() {
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



	void inOrderTraversal(Node root) {
		if(root == null) return;
		inOrderTraversal(root.left);
		System.out.println(root.data);
		inOrderTraversal(root.right);
	}


	public static void main(String[] args) {

		BreadthFirstSearch bst = new BreadthFirstSearch();
		int arr[] = {20, 15, 200, 25, -5, 0, 100, 20, 12, 126, 1000, -150};

		for(int i = 0; i<arr.length; i++)
			bst.add(arr[i]);
		bst.inOrderTraversal(bst.root);
		bst.performBFS(bst.root);
	}

	private void performBFS(Node root2) {
		
		
		
	}





}
