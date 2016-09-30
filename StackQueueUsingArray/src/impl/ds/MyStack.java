package impl.ds;

public class MyStack {

	public static void main(String[] args) {
		StackImp s = new StackImp();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		System.out.println(s.pop());
		s.push(50);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		

	}

}
