import java.util.HashMap;


public class RemoveAlternateDuplicates {

	public static void main(String[] args) {
	
		String str = "Today is the day";
		String strLow = str.toLowerCase();
		HashMap<String,Boolean> map = new HashMap<String, Boolean>();
		char[] ch = strLow.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<ch.length;i++) {
			
			if(!map.containsKey(ch[i]+"")) {
				System.out.println(ch[i]);
				map.put(ch[i]+"", true);
				sb.append(ch[i]);
			}
		}
		
		System.out.println(sb);
	}

}
