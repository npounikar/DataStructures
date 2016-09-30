
public class Atoi {

	public static void main(String[] args) {
		
		
		String str1 = "89";
		char[] strchar = str1.toCharArray();
		int res2 = 0;
		
		for(int i=0; i<strchar.length; i++) {
			res2 = res2*10+strchar[i] - '0';
			System.out.println(res2);
		}
		
		
		
		String s = "12345";
		char[] str = s.toCharArray();
		int res = 0;
		System.out.println("==");
		for(int i = 0 ; i < str.length ; i++) {
			
			res = res*10 + str[i] - '0';
			System.out.println(res);
			 
		}
		
		
		
	}
	
	
	
}
