
public class ReverseString {

	public static void main(String[] args) {
		

		String strPeriod = "Liquid";
		String reverseStr = "";

		ReverseString rs = new ReverseString();
		String [] splittedPeriod = strPeriod.split(" ");
		
		if(splittedPeriod.length < 1)
			System.out.println("No String");
		if(splittedPeriod.length == 1)
			System.out.println(strPeriod);
		
		if(rs.hasPeriod(strPeriod)){
			
			for(int i = splittedPeriod.length-1; i>=0; i--) {
				System.out.println("YES");
				if(i == splittedPeriod.length-1)
					reverseStr = reverseStr +splittedPeriod[i].substring(0, splittedPeriod[i].length()-1) ;
				else
					reverseStr = reverseStr + " " +splittedPeriod[i] ;
				
			}
			System.out.println(reverseStr+".");
			
		} else {
			String [] splitted = strPeriod.split(" ");
			for(int i = splitted.length-1; i>=0; i--) {
				reverseStr = reverseStr  + " " + splitted[i];
			}
			System.out.println(reverseStr);
		}

	}

	private boolean hasPeriod(String strch) {
		return strch.charAt(strch.length()-1) == '.';
	}

}
