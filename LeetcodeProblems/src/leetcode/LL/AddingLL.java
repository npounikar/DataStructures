package leetcode.LL;

public class AddingLL {

	Node head;

	public AddingLL() {
		head = null;
	}

	public void insert(int val) {
		Node newNode = new Node(val);
		newNode.next = head;
		head = newNode;
	}

	public Node insertAtEnd(int val) {

		if(head == null) 
			insert(val);
		else {
			Node current = head;
			while (current.next != null)
				current = current.next;
			Node newNode = new Node(val);
			newNode.next = null;
			current.next = newNode;
		}
		return head;
	}
	
	
	public void print(Node head2) {
		Node current = head2;
		if(current ==  null)
			return ;
		while(current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
	}


	public static void main(String[] args) {


		AddingLL l1 = new AddingLL();
		l1.insert(3);
		l1.insert(2);
		l1.insert(1);
		l1.insert(0);
		l1.print(l1.head);
		System.out.println("");

		AddingLL l2 = new AddingLL();
		l2.insert(7);
		l2.insert(8);
		l2.insert(9);
		l2.insert(4);
		l2.print(l2.head);
		System.out.println("");

		AddingLL add = new AddingLL();
		add.performAddition(l1.head, l2.head);
		

	}

	private void performAddition(Node l1, Node l2) {
		
		AddingLL resultLL = new AddingLL();
		Node resultHead = null;
		
		int carry = 0;
		while(l1 != null && l2 != null) {
			int sum = l1.data + l2.data + carry;
			carry = sum/10;
			if(carry >0)
				sum = sum%10;
			
			resultHead = resultLL.insertAtEnd(sum);
			
			l1 = l1.next;
			l2 = l2.next;
		}
		
		if(carry>0)
			resultHead = resultLL.insertAtEnd(carry);

		print(resultHead);

	}
}