
public class Denominations {
	
	public static void main(String args[]) {
		
		int x = 10;
		int[] dem = {1,2,5,10};
		
		boolean div2 = false, div5 = false, div10 = false;
		int num10 = 0, num5 = 0, num2 = 0;
		
		String u = "f";
		if(Integer.parseInt(u) < Integer.parseInt("a") || Integer.parseInt(u) > Integer.parseInt("Z"))
			System.out.println(u);
		
		if(x%10 == 0)
			div10 = true;
		if(x%5 == 0)
			div5 = true;
		if(x%2 == 0)
			div2 = true;
		
		

		
		int count = 1;
		while(count <5) {
			
			if(count == 1) {
				if(div10)
					num10 = x/10;
				if(div5)
					num5 = x/5;
				if(div2)
					num2 = x/2;
				
				System.out.println("10 X "+num10);
				System.out.println("5 X "+num5);
				System.out.println("2 X "+num2);
				System.out.println("1 X "+x);
			}
			
			if(count == 2) {
				
				break;
				
			}
				
			count++;
		}
		
	}

}
