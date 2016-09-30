
public class RemoveContinuousDuplicates {

	public static void main(String[] args) {
		String str = "abaaabbbcdddee";
		char[] ch = str.toCharArray();
		char ch1 = ' ';
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<ch.length-1; i++) {
			ch1 = ch[i];
			System.out.println(ch1);
			if(ch[i] != ch[i+1]) {
				sb.append(ch1);
			}
		}
		System.out.println(sb.append(ch1));
	}

}
