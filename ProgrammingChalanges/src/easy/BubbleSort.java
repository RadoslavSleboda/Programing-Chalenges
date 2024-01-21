package easy;

//Sort array from largest to smallest number by swapping neighbouring elements

public class BubbleSort {
	
	static int[] arr = {32,55,11,8,12,76,99,53,4,2,19,3,97,88,1,66,4};

	public static void main(String[] args) {
		bubbleSort(arr);

	}
	
	public static void bubbleSort(int[] arr) {
	
	boolean isSorted = false;
	while(!isSorted) {
		
	isSorted = true;
	
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] < arr[i+1]) {
				int temporal = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temporal;
				isSorted = false;
			}
			
		}
		}
	
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		
	}
	
}
