package leetcode.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class RomanNumbersort {

	public static void main(String[] args) {		
		
		String[] names = {"Louis IX", "Louis VIII", "Arthur XLVI", "Louis VI"};
		Arrays.sort(names);
		
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		for(int i=0; i<names.length; i++) {	
			String[] name = names[i].split(" ");
			if(!map.containsKey(name[0])) {
				List<String> num = new ArrayList<String>();
				num.add(name[1]);
				map.put(name[0], num);
			} else 
				map.get(name[0]).add(name[1]);
		}
		
		Iterator entry = map.entrySet().iterator();
		while(entry.hasNext()) {
			Entry pair = (Entry)entry.next();
			String name = (String)pair.getKey();
			List<String> num = (List<String>)pair.getValue();
			
			sortRoman(num);
			for(int i = 0 ; i<num.size(); i++)
				System.out.println(name+" "+num.get(i));
			
			System.out.println(" ");
		}
	}

	private static void sortRoman(List<String> num) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		List<Integer> numbers = new ArrayList<Integer>();
		for(int i = 0 ; i<num.size(); i++) {
			map.put(romanToDecimal(num.get(i)), num.get(i));
			numbers.add(romanToDecimal(num.get(i)));
		}
		Collections.sort(numbers);
    List<String> arr = new ArrayList<String>();
		for(int i = 0 ; i<numbers.size(); i++) {
			arr.add(map.get(numbers.get(i)));
		}
		
		
	}

	public static int romanToDecimal(String romanNumber) {
        int decimal = 0;
        int lastNumber = 0;
        String romanNumeral = romanNumber.toUpperCase();
        /* operation to be performed on upper cases even if user 
           enters roman values in lower case chars */
        for (int x = romanNumeral.length() - 1; x >= 0 ; x--) {
            char convertToDecimal = romanNumeral.charAt(x);

            switch (convertToDecimal) {
                case 'M':
                    decimal = processDecimal(1000, lastNumber, decimal);
                    lastNumber = 1000;
                    break;

                case 'D':
                    decimal = processDecimal(500, lastNumber, decimal);
                    lastNumber = 500;
                    break;

                case 'C':
                    decimal = processDecimal(100, lastNumber, decimal);
                    lastNumber = 100;
                    break;

                case 'L':
                    decimal = processDecimal(50, lastNumber, decimal);
                    lastNumber = 50;
                    break;

                case 'X':
                    decimal = processDecimal(10, lastNumber, decimal);
                    lastNumber = 10;
                    break;

                case 'V':
                    decimal = processDecimal(5, lastNumber, decimal);
                    lastNumber = 5;
                    break;

                case 'I':
                    decimal = processDecimal(1, lastNumber, decimal);
                    lastNumber = 1;
                    break;
            }
        }
      return decimal;
    }

    public static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
        if (lastNumber > decimal) {
            return lastDecimal - decimal;
        } else {
            return lastDecimal + decimal;
        }
    }
}
