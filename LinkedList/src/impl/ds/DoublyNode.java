package impl.ds;

public class DoublyNode {
	
	int data;
	DoublyNode next,previous;
	
	public DoublyNode(int data) {
		next = null;
		previous=null;
		this.data = data;
	}
	
	public DoublyNode(DoublyNode previous, int data, DoublyNode next) {
		this.next = next;
		this.data = data;
		this.previous = previous;
	}
	
	public int getData() {
		return data;
	}

}
