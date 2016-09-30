package com.amazon.intern;

public class ReverseLinkedList {
	
	Node head;
	
	ReverseLinkedList(){
		head = null;
	}
	
	
	private void insert(int i) {
		Node n = new Node(i);
		n.next = head;
		head = n;
		
	}
	
	
	public boolean delete() {
		
		if(head ==  null)
			return false;
		
		head = head.next;
		return true;
	}
	
	public void print() {
		Node current = head;
		
		if(current ==  null)
			return ;
		while(current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("tail");
	}
	
	public static void main(String[] args) {
		ReverseLinkedList rll = new ReverseLinkedList();
		rll.insert(6);
		rll.insert(4);
		rll.insert(2);
		rll.insert(1);
		
		rll.print();
		ReverseLinkedList rll1 = new ReverseLinkedList();
		rll1.insert(9);
		rll1.insert(7);
		rll1.insert(5);
		rll1.insert(3);
		rll1.print();
		
		
		
		Node merged = rll.merge(rll, rll1);
		rll.print(merged);
		
		rll.reverse(rll.head);
		rll.print(); 
	
	}


	private Node merge(ReverseLinkedList rll,
			ReverseLinkedList rll1) {
		
		Node ll1  = rll.head;
		Node ll2  = rll1.head;
		Node temphead = new Node();
		Node m  = temphead;
		
		while(ll1 != null && ll2 != null){
			
			if(ll1.data <= ll2.data) {
				m.next = ll1;
				ll1 = ll1.next;
			} else {
				m.next = ll2;
				ll2 = ll2.next;
			}
			m = m.next;
		}
		if(ll1 != null)
            m.next = ll1;
        if(ll2 != null)
            m.next = ll2;
 
        return temphead.next;
	}


	private void print(Node merged) {
		Node current = merged;
		
		if(current ==  null)
			return ;
		while(current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("tail");
		
	}


	private void reverse(Node head2) {
		
		Node previous, next, current;
		
		if(head2 == null || head2.next == null)
			return;
		
		previous = null;
		current = head;
		next = null;
		
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		
		head = previous;
	}

	

}
