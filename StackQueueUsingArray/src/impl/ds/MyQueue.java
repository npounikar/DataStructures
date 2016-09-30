package impl.ds;

public class MyQueue {

	public static void main(String[] args) {

		QueueImp q = new QueueImp();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.isEmpty());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());

	}

}
