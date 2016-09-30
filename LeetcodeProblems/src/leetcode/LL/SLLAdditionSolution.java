package leetcode.LL;

public class SLLAdditionSolution {

	public ListNode buildSLLs(int[] is) {
		
		ListNode root = null;
		
		for(int i = 0 ; i < is.length ; i++) {
			
			ListNode  newNode;
			if(root == null)
				newNode  = new ListNode(is[i]);
			else {
				newNode  = new ListNode(is[i]);
			}
		}
		
		return root;
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = null;
        
        while(l1 != null && l2 != null) {
        	
        }
        
        return root;
    }

}
