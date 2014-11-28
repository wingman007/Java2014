package ex2;

import java.util.*;

public class Ex2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = popIntArr(12, 5);

		System.out.println(Arrays.toString(arr));

		revArr(arr);

	}

	/**
	 * populate random array of ints
	 * 
	 * @param int maxVal maximal value of elements
	 * @param int numEl number of elements
	 * 
	 * @return int[] arr
	 */
	public static int[] popIntArr(int maxVal, int numEl) {
		Random rand = new Random();
		int[] arr = new int[numEl];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = rand.nextInt() % maxVal + 1;

		}

		return arr;

	}

	public static void revArr(int[] arr) {
		for (int i = (arr.length - 1); i >= 0; i--) {
			System.out.printf("%-3d", arr[i]);

		}
		System.out.println();
	}

}
