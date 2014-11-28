package ex3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Ex3_02_09 {
	/**
	 * За масив от реални числа, намерете средно-аритметичното от елементите
	 * т.е. сумата_от_елементите/броя_на_елементите.
	 */

	public static Random rand = new Random();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] arr = arrayOfFloats(5, 10);
		System.out.println(Arrays.toString(arr));

		System.out.println(arith(arr));

		System.out.println(sumPositives(arr));

	}

	public static float[] arrayOfFloats(int numEl, int maxVal) {

		float[] arr = new float[numEl];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (float) (rand.nextInt() % maxVal + 1);
		}
		return arr;
	}

	public static float arith(float[] arr) {
		int counter = 0;
		float sum = 0;
		for (int i = 0; i < arr.length; i++) {
			counter++;
			sum += arr[i];

		}

		return sum / counter;
	}

	public static float sumPositives(float[] arr) {
		float sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				sum += arr[i];
			}
		}
		return sum;
	}

	public static double quadratic(float[] arr) {

		double sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += Math.pow(arr[i], 2);
		}
		return Math.sqrt(sum);
	}

	public static float powSum(float[] arr) {
		float sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += Math.pow(arr[i], 2);
		}
		return sum;

	}

	public static float powAbsVal(float[] arr) {
		float sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += Math.abs(arr[i]);
		}
		return sum;

	}

	public static float max(float[] arr) {
		float max = Float.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		return max;

	}

	public static float min(float[] arr) {
		float min = Float.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		return min;

	}

	public static float sumEvenPos(float[] arr) {
		float sum = 0;
		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 0) {
				sum += arr[i];
			}

		}

		return sum;

	}

}
