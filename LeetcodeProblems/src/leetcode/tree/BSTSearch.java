package leetcode.tree;

public class BSTSearch {
	   Node root;
		
	    public BSTSearch() {
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
				
			BSTSearch bst = new BSTSearch();
			
			bst.add(5);
			bst.add(2);
			bst.add(8);
			bst.add(-4);
			bst.add(18);
			bst.add(7);
			System.out.println(bst.search(7));

		}

		
		private boolean search(int data) {
			return search(root, data);
		}
		
		
		private boolean search(Node current, int i) {
			
			boolean found = false;
			while((current!= null) && !found) {
				if(current.data > i)
					current = current.left;
				else if(current.data < i)
					current = current.right;
				else {
					found = true;
					break;
				}
			}
			
			return found;
		}
		
}
