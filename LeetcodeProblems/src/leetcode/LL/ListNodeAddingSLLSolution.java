package leetcode.LL;

public class ListNodeAddingSLLSolution {

	public static void main(String[] args) {
		
		SLLAdditionSolution sll = new SLLAdditionSolution();
		ListNode fisrtRoot = sll.buildSLLs(new int[] {1,2,3});
		ListNode secondRoot = sll.buildSLLs(new int[] {1,2,3});
		ListNode resultRoot = sll.addTwoNumbers(fisrtRoot, secondRoot);
		
		while(resultRoot != null) {
			System.out.println(resultRoot.val+"->");
			resultRoot = resultRoot.next;
		}
	}

}
