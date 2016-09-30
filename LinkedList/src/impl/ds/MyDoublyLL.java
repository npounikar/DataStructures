package impl.ds;

public class MyDoublyLL {

	public DoublyNode head;
	int size = 0;
	DoublyNode dn;
	
	public MyDoublyLL() {
		head = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		if(head == null)
			return true;
		return false;
		
	}
	
	
	public void addFront(int data) {
		
		if(head == null)
			head = new DoublyNode(null, data, null);
		else {
		    dn = new DoublyNode(null, data, head);
			head.previous = dn;
			head = dn;
		}
		size++;

	}

	public void addRear(int data) {
		
		if(head == null)
			head = new DoublyNode(null, data, null);
		else {
		    DoublyNode link = head;
		    
		    while(link.next!=null)
		    	link = link.next;
			
		    dn = new DoublyNode(link,data,null);
		    link.next = dn;
		}
		size++;

	}
	
	public void insertAt(int data, int index) {
		if(head==null)
			return;
		
		if(index<1 || index>size)
			return;
		
		DoublyNode link = head;
		int i = 1;
		while( i < index ) {
			link = link.next;
			i++;
		}
		if(link.previous == null) {
			DoublyNode newNode = new DoublyNode(null,data,link);
			link.previous = newNode;
			head = newNode;
			
		} else {
			DoublyNode newNode = new DoublyNode(link.previous,data,link);
			link.previous.next = newNode;
			link.previous = newNode;
		}
			
		size++;
	}

	
	public void removeFront(){
		if(head==null)
			return;
		head = head.next;
		head.previous = null;
		size--;
	}
	
	public void removeRear(){
		if(head==null)
			return;
		
		if(head.next == null) {
			head = null;
			size--;
			return;
		}	
		
		DoublyNode link = head;
		while(link.next.next!=null)
			link = link.next;
		
		link.next = null;
		size--;
		
	}
	
	public void removeAt(int index) {
		
		if(head==null) return;
		if(index<1 || index>size) return;
		
		DoublyNode link = head;
		int i = 1;
		while(i< index) {
			link = link.next;
			i++;
		}
		
		if(link.next == null)
			link.previous.next = null;
		else if(link.previous == null) {
			link = link.next;
			link.previous = null;
			head = link;
		} else {
			link.previous.next = link.next;
			link.next.previous = link.previous;
		}
		
		size--;
	}
	
	public int getSize() {
		return size;
	}
	
	public void print() {
		DoublyNode current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public static void main(String[] args) {
			MyDoublyLL dll = new MyDoublyLL();
			dll.addFront(10);
			dll.addFront(20);
			dll.addFront(30);
			dll.print();
			System.out.println(dll.getSize());
			System.out.println("-----------------");
			
			dll.addRear(11);
			dll.addRear(22);
			dll.addRear(33);
			dll.print();
			System.out.println(dll.getSize());
			
			System.out.println("-----------------");
			
			dll.removeFront();
			dll.removeFront();
			dll.print();
			System.out.println(dll.getSize());
			
			System.out.println("-----------------");
			
			dll.removeRear();
			dll.removeRear();
			dll.print();
			System.out.println(dll.getSize());

			System.out.println("-----------------");
			
			dll.insertAt(100, 2);
			dll.insertAt(200, 1);
			dll.print();
			System.out.println(dll.getSize());
			System.out.println("-----------------");
			
			
			dll.removeAt(2);
			dll.removeAt(1);
			dll.print();
			System.out.println(dll.getSize());
	}

}
