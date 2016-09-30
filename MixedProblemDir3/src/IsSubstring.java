
public class IsSubstring {

	public static void main(String[] args) {
		
		
		System.out.println("===============================");
		
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		
		System.out.println(IsSubstring.isSubstring(s1, s2));
		
	}

	private static boolean isSubstring(String s1, String s2) {
		
		boolean match=false;
		
		char[] s1Ch = s1.toCharArray();
		char[] s2Ch = s2.toCharArray();
		int j = 0;
		for(int i = 0 ; i < s1Ch.length-1; i++) {
			if(s1Ch[i] == s2Ch[j] && s1Ch[i+1] == s2Ch[j+1] ) {
				j++;
				match = true;
			} else {
				j = 0;
				match = false;
			}
		}
		for(int i = 0 ; i <= j; i++) 
			System.out.print(s2Ch[i]);
		
		System.out.println("");
		return match;
	}
	
}
