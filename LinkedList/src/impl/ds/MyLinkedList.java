package impl.ds;

public class MyLinkedList {

	private Node head;
	
	public MyLinkedList() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	
	public void insert(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		
	}
	
	public boolean delete(){
		if(head == null)
			return false;
		
		head = head.next;
		return true;
	}
	
	public void print() {
		Node current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public static void main(String[] args) {
	
		MyLinkedList ll = new MyLinkedList();
		ll.insert(23);
		ll.insert(26);
		ll.insert(56);
		ll.delete();
		ll.print();
		
	}
	
}
