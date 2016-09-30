
public class LCS {

	public static void main(String[] args) {
		
		String str1 = "aaabsdcgxrde";
		String str2 = "ababszxc";
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		int len = 0;
		
		if(ch1.length > ch2.length)
			len = ch1.length;
		
		int i = 0, j = 0, lastI = 0;
		StringBuilder sb = new StringBuilder();
		
		while(i<len) {
			if(ch2[j] == ch1[i]) {
				sb.append(ch2[j]);
				lastI = i;
				i++;
				j++;
			} else {
				i++;
			}
			
			if(i == len) {
				i = lastI+1;
				j++;
			}
			
			if (j == ch2.length)
				break;
				
		}
		System.out.println(sb);
	}

}
