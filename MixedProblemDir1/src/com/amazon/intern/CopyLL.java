package com.amazon.intern;

public class CopyLL {
	
	Node head;
	
	CopyLL() {
		head = null;
	}
	
	public void insert(int x) {
		Node n = new Node(x);
		n.next = head;
		head = n;
	}
	
	public boolean delete(int x) {
		if(head ==  null)
			return false;
		
		head = head.next;
		return true;
	}
	
	public void print() {
		Node current = head;
		if(head ==  null )
			return;
		while(current!=null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.print("tail");
		
	}
	
	public static void main(String[] args) {
		CopyLL rll = new CopyLL();
		rll.insert(6);
		rll.insert(4);
		rll.insert(2);
		rll.insert(1);
		rll.print();
		System.out.println(rll.hasCycle(rll.head));
		System.out.println("----copied ll --------");
		Node cpyhead = rll.copy(rll);
		Node current1 = cpyhead;
		if(cpyhead ==  null )
			return;
		while(current1!=null) {
			System.out.print(current1.data + " -> ");
			current1 = current1.next;
		}
		System.out.print("tail");
		

	}
	
	
	
	
	private Node copy(CopyLL rll) {
		Node cpy = rll.head;
		Node temp = new Node();
		Node t = temp;
		
		while(cpy!=null){
			t.next = cpy;
			cpy = cpy.next;
			t = t.next;
			
		}
		
		return temp.next;
	}

	public static boolean hasCycle(Node temphead) {
        Node fast = temphead;
        Node slow = temphead;
 
        if(temphead == null)
            return false;
 
        if(temphead.next == null)
            return false;
 
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
 
            if(slow == fast)
                return true;
        }
 
        return false;
    }

}
