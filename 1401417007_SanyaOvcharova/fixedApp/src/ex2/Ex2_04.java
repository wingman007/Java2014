package ex2;

public class Ex2_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("The larger is " + max(4, 5));
		max1(5,6);
		
	}

	public static int max(int a, int b) {
		int max = a > b ? a : b;

		return max;
	}
	public static void max1(int a, int b) {
		int max = a > b ? a : b;

		System.out.println("The bigger number is " + max);
	}
}
