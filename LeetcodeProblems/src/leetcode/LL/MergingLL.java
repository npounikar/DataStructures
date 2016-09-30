package leetcode.LL;

public class MergingLL {

	Node head;

	public MergingLL() {
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


		MergingLL l1 = new MergingLL();
		l1.insert(3);
		l1.insert(2);
		l1.insert(1);
		l1.insert(0);
		l1.print(l1.head);
		System.out.println("");

		MergingLL l2 = new MergingLL();
		l2.insert(7);
		l2.insert(6);
		l2.insert(5);
		l2.insert(4);
		l2.print(l2.head);
		System.out.println("");

		MergingLL m = new MergingLL();
		m.merge(l1.head, l2.head);
		

	}

	private void merge(Node l1, Node l2) {
		
		MergingLL resultLL = new MergingLL();
		Node resultHead = null;
		
		while(l1 != null && l2 != null) {

			if(l1.data<l2.data) {
				resultHead = resultLL.insertAtEnd(l1.data);
				l1 = l1.next;
			} else  if(l2.data<l1.data) {
				resultHead = resultLL.insertAtEnd(l2.data);
				l2 = l2.next;
			} else if(l1.data==l2.data) {
				resultHead = resultLL.insertAtEnd(l1.data);
				resultHead = resultLL.insertAtEnd(l2.data);
				l1 = l1.next;
				l2 = l2.next;
			}
			
			while(l1!=null) {
				resultHead = resultLL.insertAtEnd(l1.data);
				l1 = l1.next;
			}
			while(l2!=null) {
				resultHead = resultLL.insertAtEnd(l2.data);
				l2 = l2.next;
			}
			
		}

		print(resultHead);

	}
}