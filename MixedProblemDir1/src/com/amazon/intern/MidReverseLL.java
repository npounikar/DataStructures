package com.amazon.intern;

public class MidReverseLL {

	Node head;
	
	private void print(Node head2) {
		
		Node current = head2;
		if(current == null)
			return;
		
		while(current!=null) {
			System.out.print(current.data+" - >");
			current = current.next;
		}
			System.out.println("");
	}

	
	
	
	
	private void insert(int i) {
		
		Node n = new Node(i);
		n.next = head;
		head = n;
	}
	
	
	
	
	public static void main(String[] args) {
			
		MidReverseLL mrll = new MidReverseLL();
		mrll.insert(5);
		mrll.insert(4);
		mrll.insert(3);
		mrll.insert(2);
		mrll.insert(1);
		mrll.print(mrll.head);
		mrll.reverse(mrll.head);
		mrll.print(mrll.head);
		

	}
	
	

	private void reverse(Node head2) {
		
		Node current = head2;
		Node curr = head2;
		Node current2;
		Node prev = null;
		Node next = null;
		
		
		if(current == null)
			return;

		int count = 0;
		while(current!=null) {
			count++;
			current = current.next;
		}
	
		int mid = count / 2;
		int currentCount = 0;
		
		while(currentCount < mid && curr != null) {
			currentCount++;
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		
		}
		
		prev.next = next;
		

		
		
		
		System.out.println("");
	}


}
