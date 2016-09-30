/****
 * Google Coding Challenge : Find maximum number after removing a single digit which 
 * occured more than once in that number.
 * 
 */
public class MaximumNumber {

	public static void main(String[] args) {
		
		System.out.println(findMaxValue("122333"));
	}

	private static String findMaxValue(String s) {
		
		int removeIndex = 0;
		for(int i=0; i < s.length()-1; i++){
			boolean isGroup = false;
			while((i+1) < s.length() && s.charAt(i) == s.charAt(i+1)) {
				isGroup =true;
				i++;
			}
			if((isGroup && (s.charAt(i + 1) > s.charAt(i))) || ((s.length()-1) == i)) {
				removeIndex = i;
				break;
			}
		}
		return s.substring(0, removeIndex) + s.substring(removeIndex + 1);
	}

}
