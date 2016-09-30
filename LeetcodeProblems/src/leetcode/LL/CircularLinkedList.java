package leetcode.LL;

public class CircularLinkedList {

	Node head;

	public CircularLinkedList() {
		head = null;
	}

	public void insert(int val) {
		Node newNode = new Node(val);
		newNode.next = head;
		head = newNode;
	}

	

	public void makeLLCircular() {

		Node current = head, first = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
		current.next = head;
	}
	

	private static boolean isCircluar(Node head2) {
		
		Node slow = head2;
		Node fast = head2.next;
		
		while(true) {
			if(fast == null ||fast.next == null)
				return false;
			else if(fast == slow || fast.next == slow)
				return true;
			else {
				slow = slow.next;
				fast = fast.next.next;
			}
		}
	}

	public void print() {
		Node current = head;
		if(current ==  null)
			return ;
		while(current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
	}


	public static void main(String[] args) {


		CircularLinkedList l1 = new CircularLinkedList();

		//insert at start
		l1.insert(30);
		l1.insert(20);
		l1.insert(10);
		l1.insert(0);
		l1.print();
		System.out.println("");
		l1.makeLLCircular();
		
		
		System.out.println("");
		if(isCircluar(l1.head))
			System.out.println("Circular");
		else
			System.out.println("Not circular");

	}

}
