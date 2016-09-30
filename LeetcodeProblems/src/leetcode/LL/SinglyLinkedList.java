package leetcode.LL;

public class SinglyLinkedList {

	Node head;

	public SinglyLinkedList() {
		head = null;
	}

	public void insertAtStart(int val) {
		Node newNode = new Node(val);
		newNode.next = head;
		head = newNode;
	}

	public void insertAtEnd(int val) {

		if(head == null) 
			insertAtStart(val);
		else {
			Node current = head;
			while (current.next != null)
				current = current.next;
			Node newNode = new Node(val);
			newNode.next = null;
			current.next = newNode;
		}
	}


	public void insertAt(int index, int val) {
		Node current = head, previous = null;
		if(current ==  null)
			return ;
		else {

			Node newNode = new Node(val);
			int count = 1;
			while(current!=null && count != index) {
				count++;
				previous = current;
				current = current.next;
			}

			newNode.next = current;
			previous.next = newNode;
		}
	}


	private void deleteAtstart() {
		Node current = head;
		if(current == null)
			return;

		if(current.next == null)
			head = null;
		else if(current.next != null){
			current = current.next;
			head = current;
		}

	}


	private void deleteAtEnd() {
		Node current = head;
		if(current == null)
			return;

		if(current.next == null)
			head = null;
		else {
			while(current.next.next != null) 
				current = current.next;

			current.next = null;
		}
	}


	private void delete(int i) {
		Node current = head;
		if(current == null)
			return;

		if(current.next == null && current.data == i)
			head = null;
		else {
			while(current.next.next != null && current.next.data != i) 
				current = current.next;

			current.next = current.next.next;
		}

	}


	private void reverseLL(Node head2) {

		Node previous, next, current;

		if(head2 == null || head2.next == null)
			return;

		previous = null;
		current = head2;
		next = null;

		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}

		head = previous;
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

	
	public void print(Node current) {
		
		if(current ==  null)
			return ;
		while(current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
	}

	public static void main(String[] args) {

		int index = 5;
		SinglyLinkedList l1 = new SinglyLinkedList();

		//insert at start
		l1.insertAtStart(30);
		l1.insertAtStart(20);
		l1.insertAtStart(10);
		l1.insertAtStart(0);

		//insert at end
		l1.insertAtEnd(50);
		l1.insertAtEnd(100);
		l1.insertAtEnd(200);

		//insert at 
		l1.insertAt(index, 75);
		l1.print();
		System.out.println();

		//delete at start
		l1.deleteAtstart();
		l1.print();
		System.out.println();

		//delete at end
		l1.deleteAtEnd();
		l1.print();
		System.out.println();

		//delete at
		l1.delete(75);

		//print
		l1.print();


		//Reversing the LL
		System.out.println();
		System.out.println("Reversing the LL-----------------");
		l1.reverseLL(l1.head);
		l1.print();
	}

	//Hackerrank
	public Node deleteGreaterThan(Node l1, int x) {

		Node current = l1;

		if(current == null)
			l1 = null;

		if(current.next == null && current.data > x)
			l1 = null;

		else {
			while(current.next != null && current.data > x){
				current = current.next;
				l1 = current;
			}
		}

		while(current.next != null) { 
			if(current.next.data>x) {
				current.next = current.next.next;
			} else 
				current = current.next;
		}

		return l1;
	}




}
