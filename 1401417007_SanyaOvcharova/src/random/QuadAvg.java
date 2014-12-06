package random;

public class QuadAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * Quadratic average
	 * 
	 * @param arr
	 * @return double
	 */

	static double srkv(int[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i] * arr[i];
		}

		sum = Math.sqrt(sum / arr.length);
		return sum;
	}

}
