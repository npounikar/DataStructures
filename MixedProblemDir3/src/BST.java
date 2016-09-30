
public class BST {
	
	BSTNode root;
	
	BST() {
		root = null;
	}

	boolean isEmpty() {
		return root == null;
	}
	

	private void add(int i) {
		root = addNode(root, i);
	}
	
	
	private BSTNode addNode(BSTNode root2, int i) {
		
		if(root2== null) 
			root2 = new BSTNode(i);
		else if(root2.getData() >= i)
			root2.leftChild = addNode(root2.leftChild, i);
		else if(root2.getData() < i)
			root2.rightChild = addNode(root2.rightChild, i);
		
		return root2;
	}
	
	private void preOrderTraversal(BSTNode root2) {
		
		if(root2 == null) return;
		System.out.println(root2.getData());
		preOrderTraversal(root2.leftChild);
		preOrderTraversal(root2.rightChild);
		
	}
	
	private void inOrderTraversal(BSTNode root2) {
		
		if(root2 == null) return;
	
		inOrderTraversal(root2.leftChild);
		System.out.println(root2.getData());
		inOrderTraversal(root2.rightChild);
		
	}
	
	private void postOrderTraversal(BSTNode root2) {
		
		if(root2 == null) return;
		
		postOrderTraversal(root2.leftChild);
		postOrderTraversal(root2.rightChild);
		System.out.println(root2.getData());
	}

	public static void main(String[] args) {
		
		BST bst = new BST();
		bst.add(9);
		bst.add(4);
		bst.add(6);
		bst.add(2);
		bst.add(7);
		bst.add(3);

		bst.inOrderTraversal(bst.root);
		bst.search(9);
		boolean valid = bst.isValidBST(bst.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.println(valid);
		

	}

	private boolean isValidBST(BSTNode root2, int minValue, int maxValue) {
		
		if(root2 == null) return true;
		
		if(root2.getData() < minValue || root.getData() > maxValue)
			return false;
		
		return isValidBST(root2.leftChild, minValue, root2.getData()) && isValidBST(root2.rightChild, root2.getData(), maxValue);

	}

	
	
	
	
	
	private void search(int i) {
		System.out.println(search(root, i));
	}

	private boolean search(BSTNode root2, int i) {
		
		boolean found =false;
		while(root2!=null && !found) {
			if(root2.getData() > i)
				root2 = root2.leftChild;
			else if(root2.getData() < i)
				root2 = root2.rightChild;
			else {
				found = true;
			}
		}
		
		return found;
	}

	




}
