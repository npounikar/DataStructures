package leetcode.string;

import java.util.Stack;

public class QueueUsingStack {

	Stack<Integer> eq = new Stack<Integer>();
	Stack<Integer> dq = new Stack<Integer>();



	public static void main(String[] args) {

		QueueUsingStack qs = new QueueUsingStack();
		qs.enqueue(1);
		qs.enqueue(2);
		qs.dequeue();
		qs.enqueue(3);
		qs.enqueue(4);
		qs.dequeue();
		qs.enqueue(5);

	}



	private void dequeue() {
		while(!eq.empty())
			dq.push(eq.pop());
		
		System.out.println(dq.pop()+" : popped");
	}



	private void enqueue(int i) {
		while(!dq.empty())
			eq.push(dq.pop());
		System.out.println(i+" : pushed");
		eq.push(i);

	}

}
