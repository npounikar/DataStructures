package impl.ds;

public class MyCircularQ {

	public int[] array;
	private int front;
	public int rear;
	private int N;
	
	public MyCircularQ() {
		N = 5;
		array = new int[N];
		front = rear = 0;
	}
	
	public void enqueue(int data) {
		int s = size();
		if( s == N-1) 
			resize();
		
		array[++rear] = data;
		if(rear == N)
			rear = 0;
	}
	
	public Integer dequeue() {
		if(isEmpty())
			return null;
		int x = array[++front];
		if (front == N)
			front = 0;
		return x;
	}
	
	private void resize() {
		int s = size();
		N = N * 2;
		int lastindex = s + 1;
		int i=0;
		int[] arr = new int[N];
		
		while(s>0) {
			s--;
			arr[i++] = array[front++];
	
			if (front == lastindex)
				front = 0; 
		}
		
		rear = i++;
		front = 0;
		array = arr;
	}

	public int size(){
		return (N-front+rear)%N;
	}
	
	public boolean isEmpty() {
		return front == rear;
	}
	
	public static void main(String[] args) {
		
		MyCircularQ q = new MyCircularQ();
		q.enqueue(1);q.enqueue(2);q.enqueue(3);
		q.dequeue();
		q.enqueue(1);
		
		
		
		while(!q.isEmpty())
			System.out.println(q.dequeue());
		
	}
	
}
