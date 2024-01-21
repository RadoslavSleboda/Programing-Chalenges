package medium;

import java.util.HashMap;
import java.util.Map;

public class FibunacciRecursionWithMemorization {

	static int n = 7;
	static int[] arr = new int[31];
	
	public static void main(String[]args) {
	System.out.println(fibunacci(n));
	}

	private static int fibunacci(int n) {
		
		if(n <= 1) {
			return n;
		} else if(arr[n] > 0) {
			//System.out.println(arr[n]);
			return arr[n];
		} else {
			int fn = fibunacci(n -1) + fibunacci(n - 2);
			arr[n] = fn;
			return fn;
		}

	}
	
}
