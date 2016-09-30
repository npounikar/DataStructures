public class ReverseLL {

	Node head;
	
	ReverseLL() {
		this.head = null;
	}
	
	
	private void insert(int data) {
		
		Node n = new Node(data);
		n.next = head;
		head = n;
			
	}
	

	

	private void reverseLL() {
		
		Node current = head;
		Node prev = null;
		Node nextNode = null;
		
		if(head == null || head.next == null)
			return;
		
		while(current!=null) {
			nextNode = current.next;
			current.next = prev;
			
			prev=current;
			current=nextNode;
			
		}
			head = prev;
	}

	
	
	
	public void printLL() {
		Node current = head;
		while(current!=null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		
	}
	
	public static void main(String[] args) {

		ReverseLL rv = new ReverseLL();
		rv.insert(1);
		rv.insert(2);
		rv.insert(3);
		rv.insert(4);
		
		rv.printLL();
		rv.reverseLL();
		System.out.println();
		rv.printLL();
	}


}
