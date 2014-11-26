package nakov;

public class Ch3_04 {

	public static int digit = 934;
	public static int digitNegative = -934;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getBinaryVal(7);
		checkBitVal(7);
		getBinaryVal(3);
		checkBitVal(3);
		getBinaryVal(digit);
		checkBitVal(digit);

		getBinaryVal(digitNegative); // Complementary code
		checkBitVal(digitNegative);

	}

	/**
	 * Check if the third bit is 1 or 0
	 * 
	 * @param digit
	 */

	public static void checkBitVal(int digit) {

		if ((digit & 4) == 0) {
			System.out.println("The third bit is 0.");
		} else {
			System.out.println("The third bit is 1.");
		}

	}

	public static void getBinaryVal(int decValue) {
		System.out.println(decValue + " is " + Integer.toBinaryString(decValue)
				+ " in binary.");
	}

}
