
public class Numbers {

	public static void printNumbers(int i) {
		
		if(i>10)
			return;
		System.out.println(i);
		printNumbers(++i);
		
	}
	
	public static void main(String[] args) {
		
		printNumbers(1);

	}

}
