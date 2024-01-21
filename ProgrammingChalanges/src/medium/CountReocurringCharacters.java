package medium;

import java.util.HashMap;
import java.util.Map;

public class CountReocurringCharacters {

	static char[] arr = {'x','c','n','a','a','b','a','c','x','t','e','a','c','n'};
	
	public static void main(String[] args) {
		
		countReocurringCharacters(arr);
		
	}

	private static void countReocurringCharacters(char[] arr) {
		Map<Character, Integer> countedChars = new HashMap<Character, Integer>();
		for(int i = 0; i < arr.length; i++) {
			if(countedChars.containsKey(arr[i])) {
				countedChars.replace(arr[i], countedChars.get(arr[i])+1);
			} else {
			countedChars.put(arr[i], 1);
			}
		}
		
		countedChars.forEach((key, value) -> System.out.println(key + " " + value));
		
	}

}
