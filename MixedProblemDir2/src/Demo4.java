

class Tree{
	
	int data;
	Tree left;
	Tree right;
}
public class Demo4 {
	
		public static void  main(String args[])
		{
			Tree root = new Tree();
			root.data=5;
			
			Tree l1 = new Tree();
			l1.data=3;
			root.left=l1;
			
			Tree r1 = new Tree();
			r1.data=10;
			root.right=r1;
			
			Tree l2 = new Tree();
			l2.data=12;
			r1.left=l2;
			
			
			Tree l3 = new Tree();
			l3.data=21;
			l2.left=l3;
			
			Tree r3 = new Tree();
			r3.data=20;
			l2.right=r3;
			
			Tree l4 = new Tree();
			l4.data=25;
			l3.left=l4;
			
			Demo4 a = new Demo4();
			int b = a.solution(root);
			System.out.println("longest path is: "+b);
		}
		
		
		public  int solution(Tree t)
		{
			
			int max=0;
			
			Tree tl = t.left;
			Tree tr = t.right;
		
			
			while(tl!=null)
			{
				
				int l = findLeftChildren(tl);
				int r = findRightChildren(tl);
				
				if(l>max)
					max=l;
				
				if(r>max)
					max=r;
				
				tl=tl.left;
			
			}
			
			while(tr!=null)
			{
				
				
				int l = findLeftChildren(tr);
				int r = findRightChildren(tr);
				
				if(l>max)
					max=l;
				
				if(r>max)
					max=r;
				
				tr=tr.right;
			
			}
			return max;
			
		}
		
		
		
		
		
		public int findLeftChildren(Tree node)
		{
			int count=0;
			
			while(node.left!=null)
			{
				node=node.left;
				count++;
			}
			
			return count;
			
		}
		
		
		
		
		public int findRightChildren(Tree node)
		{
			int count=0;
			
			while(node.right!=null)
			{
				count++;
				node=node.right;
			}
			
			return count;
			
		}
		
	
}