package ex3;

class Ex3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Да се създаде програма за преобразуване на произволно цяло десетично
		 * число въведено от клавиатурата в двоично. Да се отпечата на конзолата
		 * двоичното число.
		 */

		System.out.println(conToBi(39));
		conToBi2(39);
		// conToBi2(7);
		conToDec(100111);
		switch (3) {

			case 1:
				System.out.println("Takos");
				break;
			case 2:
				break;
			case 3:
				break;

		}

	}

	public static String conToBi(int num) {

		String numStr = Integer.toBinaryString(num);

		return numStr;
	}

	public static void conToBi2(int num) {
		int counter = 0;
		int[] digits = new int[8];
		while (true) {

			int digit = num % 2;
			num = (int) num / 2;
			
			digits[counter] = digit;
			counter++;
			

			if (num <= 0)
				break;
		}
		
		for (int i = (digits.length-1); i>=0; i--){
			System.out.print(digits[i]);
		}
		System.out.println();

	}

	public static void conToDec(int bi) {

		String bin = "" + bi;
		int sum = 0;
		int length = bin.length() - 1;

		for (int i = 0; i <= (bin.length() - 1); i++) {

			int result = Integer.parseInt("" + bin.charAt(i));

			sum += result * Math.pow(2, length);

			length--;

		}

		System.out.println(sum);

		// an*p^n + a(n-1)*p^n-1

	}

}
