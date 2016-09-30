package leetcode.string;

public class ReverseString {

	public static void main(String[] args) {
		
		String sentence = "the sky is blue red";
		String[] words = sentence.split(" ");
		String result ="";
		for(int i = words.length-1 ; i >=0; i--)
			result = result + words[i]+" ";
		
		System.out.println(result.substring(0,result.length()-1));
		
		

	}

}
