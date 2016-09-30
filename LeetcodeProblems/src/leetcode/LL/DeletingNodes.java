package leetcode.LL;

public class DeletingNodes {

	public static void main(String[] args) {
		
		SinglyLinkedList l1 = new SinglyLinkedList();
		
		//insert at start
		l1.insertAtEnd(0);
		l1.insertAtEnd(40);
		l1.insertAtEnd(30);
		l1.insertAtEnd(20);
		l1.insertAtEnd(10);
		l1.insertAtEnd(0);
		l1.insertAtEnd(30);
		l1.insertAtEnd(20);
		l1.insertAtEnd(0);
		l1.print();
		
		int x = 12;
		Node l2 = l1.deleteGreaterThan(l1.head, x);
		System.out.println("--");
		l1.print(l2);

	}

}
