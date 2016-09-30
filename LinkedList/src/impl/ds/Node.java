package impl.ds;

public class Node {

	public int data;
	public Node next;
	
	public Node(int data) {
		this.data = data;
		next = null;
	}
	public Node() {
		
		next = null;
	}
	
	public int getData() {
		return data;
	}
}

