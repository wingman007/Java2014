package ex2;



import java.util.Random;
import java.util.Scanner;


public class Ex1_11 {

	static Scanner listener = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println(calc(2,2));

		float[] arr = getInput();

		// System.out.println(Math.abs(rand.nextInt()%4));
		randCalc(arr);

	}

	/**
	 * calculate aa + 2(a -bb) + 7b
	 * 
	 * @param float 
	 * @param float 
	 * 
	 * @return float
	 **/

	public static float calc(float a, float b) {
		float sum = a * a + 2 * (a - b * b) + 7 * b;
		return sum;

	}

	/**
	 * gets 4 numbers as keyboard input 
	 * @return array of floats
	 */

	public static float[] getInput() {

		float[] array = new float[4];
		System.out
				.println("In order for us to calculate aa + 2(a -bb) + 7b, we need 4 numbers: ");
		array[0] = listener.nextFloat();
		System.out.println("Another!");
		array[1] = listener.nextFloat();
		System.out.println("Another!!");
		array[2] = listener.nextFloat();
		System.out.println("And the last!!!");
		array[3] = listener.nextFloat();
		System.out.println("Thank you!");

		return array;
	}

	/**
	 * gets 2 random vals and applies calc() 
	 * 
	 * @param float[]
	 **/

	public static void randCalc(float[] arrayOfVals) {
		Random rand = new Random();
		float val1 = arrayOfVals[Math.abs(rand.nextInt() % 4)];
		float val2 = arrayOfVals[Math.abs(rand.nextInt() % 4)];

		StringBuilder str = new StringBuilder();

		str.append("a*a + 2*(a-b*b) + 7*b, where a = ");
		str.append(val1);
		str.append(" and b = ");
		str.append(val2);
		str.append(", equals ");
		str.append(calc(val1, val2));
		System.out.println(str.toString());

	}

}
