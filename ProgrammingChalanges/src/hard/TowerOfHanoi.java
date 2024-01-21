package hard;

//We have A, B and C. On rod A we have n number of discs from biggest on the bottom to smallest on top.
//We want to move them from rod A to rod C one by one. bigger disc can´t be placed on smaller disc

public class TowerOfHanoi {
	static int n = 3;
	public static void main(String[] args) {
		move(n, "A", "B", "C");

	}
	
	public static void move(int n, String start, String other, String end) {
		if(n == 1) {
			//System.out.print("return: ");
			System.out.println("Move disc 1 from " + start + " to " + end);
			return;
		} 
			//System.out.println("first " + n + start + end);
			move(n-1, start, end, other);
			System.out.println("Move disc " + n + " from " + start + " to " + end);
			//System.out.println("second " + n + start + end);
			move(n-1, other, start, end);
		
	}

}
