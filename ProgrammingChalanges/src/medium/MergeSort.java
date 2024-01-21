package medium;

public class MergeSort {

	static int[] origin = {32,55,11,8,12,76,99,53,4,2,19,3,97,88,1,66,4};
	
	public static void main(String[] args) {
		
		sort(origin);
		
		for(int i = 0; i < origin.length; i++) {
		System.out.print(origin[i] + ", ");
		}
	}

	private static void sort(int[] origin) {
		
		if(origin.length <= 1) {
			return;
		}
		
		int mid = origin.length /2;
		
		int[] left = new int[mid];
		int[] right = new int[origin.length - mid];
		int j = 0;
		
		for(int i = 0; i < origin.length; i++) {
			if(i < mid) {
			left[i] = origin[i];
			} 
			else {
				right[j] = origin[i];
				j++;
				}
		}
		
		sort(left);
		sort(right);
		merge(origin, left, right);
	}

	private static void merge(int[] origin, int[] left, int[] right) {
		int l = 0, r = 0, o = 0;
		int leftSize = origin.length /2;
		int rightSize = origin.length - leftSize;
		
		while(leftSize > l && rightSize > r) {
			if(left[l] < right[r]) {
				origin[o] = left[l];
				o++;
				l++;
			} else {
				origin[o] = right[r];
				o++;
				r++;
				
			}
		}
		
		while(leftSize > l) {
			origin[o] = left[l];
			o++;
			l++;
		}
		while(rightSize > r) {
			origin[o] = right[r];
			o++;
			r++;
		}
		
	}

}
