package com.amazon.intern;

public class IntersectionLinkedList {
	
	Node head;
	
	public IntersectionLinkedList() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void insert(int data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
	}
	
	public boolean delete() {
		
		if(head == null)
			return false;
		
		head = head.next;
		return true;
	}
	
	
	public void print() {
		
		Node current = head;
		while(current!=null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("TAIL");
	}
	
	public static void main(String[] args) {
		
		IntersectionLinkedList ill = new IntersectionLinkedList();

		Node h1,h2;
		h1 = new Node(11);
		h2 = new Node(12);
		
		Node p1,p2;
		p1 = h1;
		p1.next = new Node(100);
		p1 = p1.next;
		p2 = h2;
		Node n = new Node(1);
		p1.next = n;
		p2.next = n;
		p2 = p2.next;
		int i=2;
		while(i<7) {
			n = new Node(i);
			p2.next = n;
			i++;
		}
		
		findIntersection(h1,h2);
		
//		ill.insert(55);
//		ill.insert(66);
//		ill.insert(77);
//		ill.insert(11);
//		ill.insert(22);
//		ill.insert(33);
//		ill.insert(44);
//		ill.insert(55);
//		ill.insert(66);
//		ill.insert(77);
//		ill.print();
//		System.out.println();
//		
//		IntersectionLinkedList ill1 = new IntersectionLinkedList();
//		ill1.insert(11);
//		ill1.insert(22);
//		ill1.insert(33);
//		ill1.insert(44);
//		ill1.insert(55);
//		ill1.insert(66);
//		ill1.insert(7);
//		ill1.insert(456);
//		ill1.print();
//		
//		ill.findIntersection(ill.head,ill1.head);
//		
//		
//		
		
	}

	private static void findIntersection(Node h1, Node h2) {
		
		Node tmp1 = h1;
		Node tmp2 = h2;
		
		int len = 0,len1 = 0;
		
		if(h1 == null || h2 ==null)
			return ;
		
		while(tmp1 != null) {
			len++;
			tmp1 = tmp1.next;
		}
		
		while(tmp2 != null) {
			len1++;
			tmp2 = tmp2.next;
		}
		
		int diff = 0;
		tmp1 = h1;
		tmp2 = h2;
		if(len > len1) {
			diff = len - len1;
			int  i = 0;
			while(i<diff){
				i++;
				tmp1 = tmp1.next;
			}
		} else {
			diff = len1 - len;
			int  i = 0;
			while(i<diff){
				i++;
				tmp2 = tmp2.next;
			}
		}
	
	while(tmp1 != null && tmp2 != null) {

			if (tmp1.data==tmp2.data) {
				System.out.println(tmp1.data);
				break;
			}
			
			tmp1 = tmp1.next;
			tmp2 = tmp2.next;
		}
		
		
	}
}
