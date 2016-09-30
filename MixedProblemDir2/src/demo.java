
import java.util.*;
	public class demo {
		public static void main(String[] args) {
			System.out.println("result:"+func("AABCCCABBA"));
		}
		public static String func(String a) {
			int i=0;
			String t,y="";
			
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("AB", "AA");
			map.put("BA","AA");
			map.put("CB","CC");
			map.put("BC","CC");
			map.put("AA","A");
			map.put("CC","C");
			
			while(i < a.length()-1) {
				t =  a.substring(i, i+2);
				System.out.println("t = "+t);
				if(map.containsKey(t)) {
					a = y+map.get(t)+a.substring(i+2,a.length());
					System.out.println("a:"+a);
					y="";
					continue;
				}
				y = y + a.substring(0,i+1);
				i++;
			}
			return a;
		}
	}
