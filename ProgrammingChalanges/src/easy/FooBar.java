package easy;

//Count numbers from 8 to 31. If number is divisible by 3 print foo, if is divisible by 5 print bar.
//If number is divisible by 3 and 5 print foobar. Else print number.

public class FooBar {

	public static void main(String[] args) {
		foobar();

	}
	
	public static void foobar() {
		for(int i = 8; i <= 31; i++) {
			if(i % 3 == 0) {
				System.out.print("foo");
			}
			if(i % 5 == 0) {
				System.out.print("bar");
			} else if(i % 3 != 0) {
			System.out.print(i);
			}
			System.out.println();
		}
	}

}
