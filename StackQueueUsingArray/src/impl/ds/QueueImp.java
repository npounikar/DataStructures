package impl.ds;

public class QueueImp {
	
	private int[] object;
	private int front;
	private int rear;
	private int qSize;
	
	public QueueImp() {
		qSize = 3;
		front = -1;
		rear = -1;
		object = new int[qSize];
	}

	
	public void enqueue(int data) {
		
		if((front+1) >= qSize) 
			resize();
		object[++front] = data;
		
	}


	public Integer dequeue() {
		
		if(front>rear)
			return object[++rear];
		return null;
	}
	
	
	public boolean isEmpty() {
		return front <= rear;
	}
	
	private void resize() {
		int[] temp = object;
		qSize = qSize*2;
		object = new int[qSize];
		
		for(int i =0 ; i<=front; i++)
			object[i] = temp[i];
		
	}
	
}
